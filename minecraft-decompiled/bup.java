import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bup(Duration a, dlz b, atm c, egz d, String e) implements buz {
   public static bup a(RecordedEvent $$0) {
      return new bup(
         $$0.getDuration(),
         new dlz($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new atm($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         egz.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
