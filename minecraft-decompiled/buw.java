import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record buw(Duration a, dlz b, String c, String d, boolean e) implements buz {
   public static buw a(RecordedEvent $$0) {
      return new buw(
         $$0.getDuration(),
         new dlz($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
