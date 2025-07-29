import java.util.ArrayList;
import java.util.List;

public record afz(int c, List<all.c<?>> d) implements zw<acq> {
   public static final zm<wx, afz> a = zw.a(afz::b, afz::new);
   public static final int b = 255;

   private afz(wx $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<all.c<?>> $$0, wx $$1) {
      for (all.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<all.c<?>> a(wx $$0) {
      List<all.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(all.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wx $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zy<afz> a() {
      return ahk.aF;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<all.c<?>> e() {
      return this.d;
   }
}
