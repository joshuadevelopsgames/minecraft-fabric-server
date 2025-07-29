import java.util.List;

public class gjf extends gjj<cyn> {
   private static final fzd h = new fzd(
      ame.b("recipe_book/filter_enabled"),
      ame.b("recipe_book/filter_disabled"),
      ame.b("recipe_book/filter_enabled_highlighted"),
      ame.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xo i = xo.c("gui.recipebook.toggleRecipes.craftable");
   private static final List<gjj.a> j = List.of(
      new gjj.a(gjp.a), new gjj.a(dcz.qj, dcz.qb, dho.c), new gjj.a(dcz.eS, dho.a), new gjj.a(dcz.rH, dcz.pz, dho.d), new gjj.a(dcz.mm, dho.b)
   );

   public gjf(cyn $$0) {
      super($$0, j);
   }

   @Override
   protected boolean a(dak $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   private boolean b(dis $$0) {
      int $$1 = this.f.o();
      int $$2 = this.f.p();

      return switch ($$0) {
         case diw $$3 -> $$1 >= $$3.b() && $$2 >= $$3.c();
         case dix $$4 -> $$1 * $$2 >= $$4.b().size();
         default -> false;
      };
   }

   @Override
   protected void a(gjh $$0, dis $$1, bdp $$2) {
      $$0.b(this.f.m(), $$2, $$1.d());
      switch ($$1) {
         case diw $$3:
            List<dak> $$4 = this.f.n();
            alp.a(this.f.o(), this.f.p(), $$3.b(), $$3.c(), $$3.f(), ($$3x, $$4x, $$5x, $$6x) -> {
               dak $$7x = $$4.get($$4x);
               $$0.a($$7x, $$2, $$3x);
            });
            break;
         case dix $$5:
            label15: {
               List<dak> $$6 = this.f.n();
               int $$7 = Math.min($$5.b().size(), $$6.size());

               for (int $$8 = 0; $$8 < $$7; $$8++) {
                  $$0.a($$6.get($$8), $$2, $$5.b().get($$8));
               }
               break label15;
            }
         default:
      }
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected xo c() {
      return i;
   }

   @Override
   protected void a(gjn $$0, cuz $$1) {
      $$0.a($$1, this::b);
   }
}
