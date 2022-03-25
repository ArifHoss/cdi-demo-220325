package evnet;

import jakarta.enterprise.event.Observes;

public class ExampleObserver {

    public void onExampleEvent(@Observes ExampleEvent event){
        System.out.println(event.getEventMessage()+"|| Best wishes from event Observers");
    }
}
