import com.mojang.serialization.MapCodec;

public class dox extends dpz {
   public static final MapCodec<dox> a = b(dox::new);

   @Override
   public MapCodec<? extends dox> a() {
      return a;
   }

   public dox(eea.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      if (!$$0.C) {
         jb $$4 = $$2.b();
         $$0.a(null, $$4, ayz.E, aza.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
