import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class hbi {
   private final gys a;
   private final hab b;

   public hbi(gys $$0, hab $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public hbi.a a(ke $$0, hbg $$1, foi $$2, gyc $$3) {
      hbi.a $$4 = new hbi.a();
      jb $$5 = $$0.j();
      jb $$6 = $$5.b(15, 15, 15);
      hbn $$7 = new hbn();
      fod $$8 = new fod();
      gyu.a();
      Map<hba, fnz> $$9 = new EnumMap<>(hba.class);
      bck $$10 = bck.a();
      List<gzb> $$11 = new ObjectArrayList();

      for (jb $$12 : jb.c($$5, $$6)) {
         eeb $$13 = $$1.a_($$12);
         if ($$13.s()) {
            $$7.a($$12);
         }

         if ($$13.x()) {
            eaz $$14 = $$1.c_($$12);
            if ($$14 != null) {
               this.a($$4, $$14);
            }
         }

         fal $$15 = $$13.y();
         if (!$$15.c()) {
            hba $$16 = gxe.a($$15);
            fnz $$17 = this.a($$9, $$3, $$16);
            this.a.a($$12, $$1, $$17, $$13, $$15);
         }

         if ($$13.o() == dwn.b) {
            hba $$18 = gxe.a($$13);
            fnz $$19 = this.a($$9, $$3, $$18);
            $$10.b($$13.b($$12));
            this.a.a($$13).a($$10, $$11);
            $$8.a();
            $$8.a((float)ke.b($$12.u()), (float)ke.b($$12.v()), (float)ke.b($$12.w()));
            this.a.a($$13, $$12, $$1, $$8, $$19, true, $$11);
            $$8.b();
            $$11.clear();
         }
      }

      for (Entry<hba, fnz> $$20 : $$9.entrySet()) {
         hba $$21 = $$20.getKey();
         foc $$22 = $$20.getValue().a();
         if ($$22 != null) {
            if ($$21 == hba.d) {
               $$4.d = $$22.a($$3.a($$21), $$2);
            }

            $$4.b.put($$21, $$22);
         }
      }

      gyu.b();
      $$4.c = $$7.a();
      return $$4;
   }

   private fnz a(Map<hba, fnz> $$0, gyc $$1, hba $$2) {
      fnz $$3 = $$0.get($$2);
      if ($$3 == null) {
         foa $$4 = $$1.a($$2);
         $$3 = new fnz($$4, VertexFormat.b.h, fob.c);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends eaz> void a(hbi.a $$0, E $$1) {
      hac<E> $$2 = this.b.a($$1);
      if ($$2 != null && !$$2.aY_()) {
         $$0.a.add($$1);
      }
   }

   public static final class a {
      public final List<eaz> a = new ArrayList<>();
      public final Map<hba, foc> b = new EnumMap<>(hba.class);
      public hbo c = new hbo();
      @Nullable
      public foc.b d;

      public void a() {
         this.b.values().forEach(foc::close);
      }
   }
}
