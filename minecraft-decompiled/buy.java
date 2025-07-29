import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record buy(Instant a, Duration b) {
   public static buy a(RecordedEvent $$0) {
      return new buy($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
