import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class glj implements gle, glf {
   private static final ame a = ame.b("spectator/teleport_to_team");
   private static final xo b = xo.c("spectatorMenu.team_teleport");
   private static final xo c = xo.c("spectatorMenu.team_teleport.prompt");
   private final List<glf> d;

   public glj() {
      fue $$0 = fue.R();
      this.d = a($$0, $$0.s.S());
   }

   private static List<glf> a(fue $$0, fjx $$1) {
      return $$1.f().stream().flatMap($$1x -> glj.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<glf> a() {
      return this.d;
   }

   @Override
   public xo b() {
      return c;
   }

   @Override
   public void a(gld $$0) {
      $$0.a(this);
   }

   @Override
   public xo aW_() {
      return b;
   }

   @Override
   public void a(fxb $$0, float $$1, float $$2) {
      $$0.a(gxx.ar, a, 0, 0, 16, 16, baj.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aX_() {
      return !this.d.isEmpty();
   }

   static class a implements glf {
      private final fjs a;
      private final Supplier<hst> b;
      private final List<grw> c;

      private a(fjs $$0, List<grw> $$1, Supplier<hst> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<glf> a(fue $$0, fjs $$1) {
         List<grw> $$2 = new ArrayList<>();

         for (String $$3 : $$1.h()) {
            grw $$4 = $$0.M().a($$3);
            if ($$4 != null && $$4.e() != dmr.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(bck.a().a($$2.size())).a();
            Supplier<hst> $$6 = $$0.ao().a($$5);
            return Optional.of(new glj.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gld $$0) {
         $$0.a(new gli(this.c));
      }

      @Override
      public xo aW_() {
         return this.a.d();
      }

      @Override
      public void a(fxb $$0, float $$1, float $$2) {
         Integer $$3 = this.a.o().f();
         if ($$3 != null) {
            float $$4 = ($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = ($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = ($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, baj.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fyo.a($$0, this.b.get(), 2, 2, 12, baj.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aX_() {
         return true;
      }
   }
}
