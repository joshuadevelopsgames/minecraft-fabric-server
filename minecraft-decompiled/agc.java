import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class agc implements zw<acq> {
   public static final zm<wx, agc> a = zw.a(agc::a, agc::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bzw, dcv>> d;

   public agc(int $$0, List<Pair<bzw, dcv>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private agc(wx $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bzw $$2 = bzw.j.get($$1 & 127);
         dcv $$3 = dcv.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wx $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bzw, dcv> $$3 = this.d.get($$2);
         bzw $$4 = (bzw)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         dcv.h.encode($$0, (dcv)$$3.getSecond());
      }
   }

   @Override
   public zy<agc> a() {
      return ahk.aI;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bzw, dcv>> e() {
      return this.d;
   }
}
