import jdk.jfr.consumer.RecordedEvent;

public record buq(String a, String b, int c, int d) {
   public static buq a(RecordedEvent $$0) {
      return new buq($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
