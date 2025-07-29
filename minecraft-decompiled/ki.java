import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ki {
   Map<String, ki.a> a = new Object2ObjectArrayMap();
   Codec<ki.a> b = Codec.stringResolver(ki.a::a, a::get);
   ki.a c = a("empty");
   ki.a d = a("water");
   ki.a e = a("lava");
   ki.a f = a("powder_snow");

   static ki.a a(String $$0) {
      Object2ObjectOpenHashMap<dcr, ki> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ki)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bxj.f);
      ki.a $$2 = new ki.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bxj interact(eeb var1, dmu var2, jb var3, cut var4, bxi var5, dcv var6);

   static void a() {
      Map<dcr, ki> $$0 = c.b();
      a($$0);
      $$0.put(dcz.tK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         der $$6 = $$5.a(kq.R);
         if ($$6 != null && $$6.a(des.a)) {
            if (!$$1x.C) {
               dcr $$7 = $$5.h();
               $$3x.a($$4, dcy.a($$5, $$3x, new dcv(dcz.tJ)));
               $$3x.a(azj.X);
               $$3x.b(azj.c.b($$7));
               $$1x.c($$2x, dqb.fT.m());
               $$1x.a(null, $$2x, ayz.cB, aza.e, 1.0F, 1.0F);
               $$1x.a(null, ejb.z, $$2x);
            }

            return bxj.a;
         } else {
            return bxj.f;
         }
      });
      Map<dcr, ki> $$1 = d.b();
      a($$1);
      $$1.put(dcz.rF, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new dcv(dcz.rG), $$0xx -> $$0xx.c(duo.g) == 3, ayz.dj));
      $$1.put(dcz.tJ, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            dcr $$6 = $$5.h();
            $$3x.a($$4, dcy.a($$5, $$3x, der.a(dcz.tK, des.a)));
            $$3x.a(azj.X);
            $$3x.b(azj.c.b($$6));
            duo.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, ayz.cC, aza.e, 1.0F, 1.0F);
            $$1x.a(null, ejb.y, $$2x);
         }

         return bxj.a;
      });
      $$1.put(dcz.tK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(duo.g) == 3) {
            return bxj.f;
         } else {
            der $$6 = $$5.a(kq.R);
            if ($$6 != null && $$6.a(des.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, dcy.a($$5, $$3x, new dcv(dcz.tJ)));
                  $$3x.a(azj.X);
                  $$3x.b(azj.c.b($$5.h()));
                  $$1x.c($$2x, $$0x.a(duo.g));
                  $$1x.a(null, $$2x, ayz.cB, aza.e, 1.0F, 1.0F);
                  $$1x.a(null, ejb.z, $$2x);
               }

               return bxj.a;
            } else {
               return bxj.f;
            }
         }
      });
      $$1.put(dcz.qG, ki::f);
      $$1.put(dcz.qF, ki::f);
      $$1.put(dcz.qE, ki::f);
      $$1.put(dcz.qD, ki::f);
      $$1.put(dcz.wm, ki::f);
      $$1.put(dcz.pw, ki::f);
      $$1.put(dcz.ws, ki::e);
      $$1.put(dcz.wz, ki::e);
      $$1.put(dcz.wH, ki::e);
      $$1.put(dcz.wD, ki::e);
      $$1.put(dcz.wE, ki::e);
      $$1.put(dcz.wB, ki::e);
      $$1.put(dcz.wF, ki::e);
      $$1.put(dcz.wv, ki::e);
      $$1.put(dcz.wA, ki::e);
      $$1.put(dcz.wx, ki::e);
      $$1.put(dcz.wu, ki::e);
      $$1.put(dcz.wt, ki::e);
      $$1.put(dcz.wy, ki::e);
      $$1.put(dcz.wC, ki::e);
      $$1.put(dcz.wG, ki::e);
      $$1.put(dcz.ww, ki::e);
      $$1.put(dcz.jH, ki::d);
      $$1.put(dcz.jO, ki::d);
      $$1.put(dcz.jW, ki::d);
      $$1.put(dcz.jS, ki::d);
      $$1.put(dcz.jT, ki::d);
      $$1.put(dcz.jQ, ki::d);
      $$1.put(dcz.jU, ki::d);
      $$1.put(dcz.jK, ki::d);
      $$1.put(dcz.jP, ki::d);
      $$1.put(dcz.jM, ki::d);
      $$1.put(dcz.jJ, ki::d);
      $$1.put(dcz.jI, ki::d);
      $$1.put(dcz.jN, ki::d);
      $$1.put(dcz.jR, ki::d);
      $$1.put(dcz.jV, ki::d);
      $$1.put(dcz.jL, ki::d);
      Map<dcr, ki> $$2 = e.b();
      $$2.put(dcz.rF, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new dcv(dcz.rH), $$0xx -> true, ayz.dm));
      a($$2);
      Map<dcr, ki> $$3 = f.b();
      $$3.put(dcz.rF, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new dcv(dcz.rI), $$0xx -> $$0xx.c(duo.g) == 3, ayz.dn));
      a($$3);
   }

   static void a(Map<dcr, ki> $$0) {
      $$0.put(dcz.rH, ki::b);
      $$0.put(dcz.rG, ki::a);
      $$0.put(dcz.rI, ki::c);
   }

   static bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, bxi $$4, dcv $$5, dcv $$6, Predicate<eeb> $$7, ayy $$8) {
      if (!$$7.test($$0)) {
         return bxj.f;
      } else {
         if (!$$1.C) {
            dcr $$9 = $$5.h();
            $$3.a($$4, dcy.a($$5, $$3, $$6));
            $$3.a(azj.X);
            $$3.b(azj.c.b($$9));
            $$1.c($$2, dqb.fS.m());
            $$1.a(null, $$2, $$8, aza.e, 1.0F, 1.0F);
            $$1.a(null, ejb.y, $$2);
         }

         return bxj.a;
      }
   }

   static bxj a(dmu $$0, jb $$1, cut $$2, bxi $$3, dcv $$4, eeb $$5, ayy $$6) {
      if (!$$0.C) {
         dcr $$7 = $$4.h();
         $$2.a($$3, dcy.a($$4, $$2, new dcv(dcz.rF)));
         $$2.a(azj.W);
         $$2.b(azj.c.b($$7));
         $$0.c($$1, $$5);
         $$0.a(null, $$1, $$6, aza.e, 1.0F, 1.0F);
         $$0.a(null, ejb.z, $$1);
      }

      return bxj.a;
   }

   private static bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, bxi $$4, dcv $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dqb.fT.m().b(duo.g, 3), ayz.dd);
   }

   private static bxj b(eeb $$0, dmu $$1, jb $$2, cut $$3, bxi $$4, dcv $$5) {
      return (bxj)(a($$1, $$2) ? bxj.c : a($$1, $$2, $$3, $$4, $$5, dqb.fU.m(), ayz.dg));
   }

   private static bxj c(eeb $$0, dmu $$1, jb $$2, cut $$3, bxi $$4, dcv $$5) {
      return (bxj)(a($$1, $$2) ? bxj.c : a($$1, $$2, $$3, $$4, $$5, dqb.fV.m().b(duo.g, 3), ayz.dh));
   }

   private static bxj d(eeb $$0, dmu $$1, jb $$2, cut $$3, bxi $$4, dcv $$5) {
      dpz $$6 = dpz.a($$5.h());
      if (!($$6 instanceof dxj)) {
         return bxj.f;
      } else {
         if (!$$1.C) {
            dcv $$7 = $$5.a(dqb.lv, 1);
            $$3.a($$4, dcy.a($$5, $$3, $$7, false));
            $$3.a(azj.aa);
            duo.d($$0, $$1, $$2);
         }

         return bxj.a;
      }
   }

   private static bxj e(eeb $$0, dmu $$1, jb $$2, cut $$3, bxi $$4, dcv $$5) {
      eap $$6 = $$5.a(kq.am, eap.a);
      if ($$6.b().isEmpty()) {
         return bxj.f;
      } else {
         if (!$$1.C) {
            dcv $$7 = $$5.c(1);
            $$7.b(kq.am, $$6.a());
            $$3.a($$4, dcy.a($$5, $$3, $$7, false));
            $$3.a(azj.Z);
            duo.d($$0, $$1, $$2);
         }

         return bxj.a;
      }
   }

   private static bxj f(eeb $$0, dmu $$1, jb $$2, cut $$3, bxi $$4, dcv $$5) {
      if (!$$5.a(azx.bT)) {
         return bxj.f;
      } else if (!$$5.c(kq.K)) {
         return bxj.f;
      } else {
         if (!$$1.C) {
            $$5.e(kq.K);
            $$3.a(azj.Y);
            duo.d($$0, $$1, $$2);
         }

         return bxj.a;
      }
   }

   private static boolean a(dmu $$0, jb $$1) {
      fal $$2 = $$0.b_($$1.d());
      return $$2.a(azu.a);
   }

   public record a(String a, Map<dcr, ki> b) {
   }
}
