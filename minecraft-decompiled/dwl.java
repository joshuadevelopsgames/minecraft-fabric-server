import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dwl extends dpp {
   public static final MapCodec<dwl> a = b(dwl::new);
   public static final ees b = eer.u;
   private static final Map<dly, List<dwl.a>> f = new WeakHashMap<>();
   public static final int c = 60;
   public static final int d = 8;
   public static final int e = 160;
   private static final int g = 2;

   @Override
   public MapCodec<? extends dwl> a() {
      return a;
   }

   protected dwl(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, true));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dmu $$0, jb $$1, eeb $$2) {
      fbt $$3 = this.a($$0, $$2);

      for (jh $$4 : jh.values()) {
         $$0.a($$1.a($$4), this, fbp.a($$3, $$4));
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(b) && jh.b != $$3 ? 15 : 0;
   }

   protected boolean a(dmu $$0, jb $$1, eeb $$2) {
      return $$0.b($$1.e(), jh.a);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dwl.a> $$5 = f.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.ae() - $$5.get(0).b > 60L) {
         $$5.remove(0);
      }

      if ($$0.c(b)) {
         if ($$4) {
            $$1.a($$2, $$0.b(b, false), 3);
            if (a($$1, $$2, true)) {
               $$1.c(1502, $$2, 0);
               $$1.a($$2, $$1.a_($$2).b(), 160);
            }
         }
      } else if (!$$4 && !a($$1, $$2, false)) {
         $$1.a($$2, $$0.b(b, true), 3);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if ($$0.c(b) == this.a($$1, $$2, $$0) && !$$1.V().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$3 == jh.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         double $$4 = $$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = $$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = $$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(lz.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   private static boolean a(dmu $$0, jb $$1, boolean $$2) {
      List<dwl.a> $$3 = f.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dwl.a($$1.j(), $$0.ae()));
      }

      int $$4 = 0;

      for (dwl.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected fbt a(dmu $$0, eeb $$1) {
      return fbp.a($$0, null, jh.b);
   }

   public static class a {
      final jb a;
      final long b;

      public a(jb $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
