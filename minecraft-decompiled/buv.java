import jdk.jfr.consumer.RecordedEvent;

public record buv(String a, String b, String c) {
   public static buv a(RecordedEvent $$0) {
      return new buv($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
