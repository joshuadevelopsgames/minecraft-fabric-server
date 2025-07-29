import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ezu extends ezz<ezu.a> {
   protected ezu(egl $$0) {
      super(dnd.b, $$0, new ezu.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = ke.e($$0);
      egd $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(ke.b(jb.a($$0)), ke.b(jb.b($$0)), ke.b(jb.c($$0)));
   }

   protected static final class a extends ezw<ezu.a> {
      public a(Long2ObjectOpenHashMap<egd> $$0) {
         super($$0);
      }

      public ezu.a a() {
         return new ezu.a(this.a.clone());
      }
   }
}
