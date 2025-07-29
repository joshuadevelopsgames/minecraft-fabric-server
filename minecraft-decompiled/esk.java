import com.mojang.serialization.MapCodec;

public class esk extends esi {
   public static final MapCodec<esk> a = MapCodec.unit(() -> esk.b);
   public static final esk b = new esk();

   @Override
   protected esj<?> a() {
      return esj.a;
   }

   @Override
   public void a(esi.a $$0) {
      bck $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jb $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dzm.d);
            }
         }

         if ($$1.a(3) > 0) {
            jb $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dzm.f);
            }
         }

         if ($$1.a(3) > 0) {
            jb $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dzm.e);
            }
         }

         if ($$1.a(3) > 0) {
            jb $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dzm.c);
            }
         }
      });
   }
}
