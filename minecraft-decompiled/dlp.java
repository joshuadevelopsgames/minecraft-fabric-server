import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dlp {
   void g(@Nullable cut var1);

   @Nullable
   cut gH();

   dlr gJ();

   void a(dlr var1);

   void a(dlq var1);

   void i(dcv var1);

   int t();

   void s(int var1);

   boolean gK();

   ayy gL();

   default boolean gT() {
      return false;
   }

   default void a(cut $$0, xo $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bxs(($$0x, $$1x, $$2x) -> new czx($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dlr $$4 = this.gJ();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gK(), this.gT());
         }
      }
   }

   boolean gP();

   boolean h(cut var1);
}
