import com.mojang.serialization.MapCodec;

public class dsn extends dzl {
   public static final MapCodec<dsn> a = b(dsn::new);
   private static final fjm b = dpz.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<? extends dsn> a() {
      return a;
   }

   protected dsn(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(azo.cs);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      edz.c($$1, $$2, $$3);
   }
}
