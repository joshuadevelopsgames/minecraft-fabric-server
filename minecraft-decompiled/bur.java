import jdk.jfr.consumer.RecordedEvent;

public record bur(double a, double b, double c) {
   public static bur a(RecordedEvent $$0) {
      return new bur($$0.getFloat("jvmSystem"), $$0.getFloat("jvmUser"), $$0.getFloat("machineTotal"));
   }
}
