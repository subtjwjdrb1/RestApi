//package study.rest.api.seo.events;
//
//
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class EventTest {
//    @Test
//    public void builder(){
//        Event event = Event.builder()
//                .name("test name")
//                .description("test description")
//
//                .build();
//        assertThat(event).isNotNull();
//    }
//
//    @Test
//    public void javaBean(){
//        Event event = new Event();
//        String testName = "Test Name";
//        String testDe = "testDe";
//
//        event.setName(testName);
//        event.setDescription(testDe);
//        assertThat(event.getName()).isEqualTo(testName);
//        assertThat(event.getDescription()).isEqualTo(testDe);
//    }
//}