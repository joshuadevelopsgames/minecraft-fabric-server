import java.util.List;

public class gjg extends gjj<cyo> {
   private static final fzd h = new fzd(
      ame.b("recipe_book/furnace_filter_enabled"),
      ame.b("recipe_book/furnace_filter_disabled"),
      ame.b("recipe_book/furnace_filter_enabled_highlighted"),
      ame.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xo i;

   public gjg(cyo $$0, xo $$1, List<gjj.a> $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(dak $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(gjh $$0, dis $$1, bdp $$2) {
      $$0.b(this.f.l(), $$2, $$1.d());
      if ($$1 instanceof dir $$3) {
         $$0.a(this.f.k.get(0), $$2, $$3.b());
         dak $$4 = this.f.k.get(1);
         if ($$4.g().f()) {
            $$0.a($$4, $$2, $$3.c());
         }
      }
   }

   @Override
   protected xo c() {
      return this.i;
   }

   @Override
   protected void a(gjn $$0, cuz $$1) {
      $$0.a($$1, $$0x -> $$0x instanceof dir);
   }
}
