import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gli implements gle, glf {
   private static final ame a = ame.b("spectator/teleport_to_player");
   private static final Comparator<grw> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xo c = xo.c("spectatorMenu.teleport");
   private static final xo d = xo.c("spectatorMenu.teleport.prompt");
   private final List<glf> e;

   public gli() {
      this(fue.R().M().n());
   }

   public gli(Collection<grw> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dmr.d).sorted(b).map($$0x -> new glb($$0x.a())).toList();
   }

   @Override
   public List<glf> a() {
      return this.e;
   }

   @Override
   public xo b() {
      return d;
   }

   @Override
   public void a(gld $$0) {
      $$0.a(this);
   }

   @Override
   public xo aW_() {
      return c;
   }

   @Override
   public void a(fxb $$0, float $$1, float $$2) {
      $$0.a(gxx.ar, a, 0, 0, 16, 16, baj.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aX_() {
      return !this.e.isEmpty();
   }
}
