package spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LocationServiceTest {

    @Mock
    private LocationDao locationDao;
    @InjectMocks
    private LocationService locationService;

    @Test
    public void testListLocations() {
        locationService.createLocation("T1", 1, 2);
        locationService.createLocation("T2", 2, 3);
        verify(locationDao).save("T2", 2, 3);
    }
}
