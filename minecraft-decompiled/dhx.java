public interface dhx<T extends dhm<?>> {
   dhx<dhb> a = a("crafting");
   dhx<dig> b = a("smelting");
   dhx<dgv> c = a("blasting");
   dhx<dil> d = a("smoking");
   dhx<dgx> e = a("campfire_cooking");
   dhx<dim> f = a("stonecutting");
   dhx<dih> g = a("smithing");

   static <T extends dhm<?>> dhx<T> a(final String $$0) {
      return jy.a(mm.q, ame.b($$0), new dhx<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
