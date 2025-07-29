import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amt {
   private static final Logger a = LogUtils.getLogger();
   private static final ame b = ame.b("tick");
   private static final ame c = ame.b("load");
   private final MinecraftServer d;
   private List<ib<ek>> e = ImmutableList.of();
   private boolean f;
   private ams g;

   public amt(MinecraftServer $$0, ams $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ek> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<ib<ek>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ib<ek>> $$0, ame $$1) {
      bts.a().a($$1::toString);

      for (ib<ek> $$2 : $$0) {
         this.a($$2, this.c());
      }

      bts.a().c();
   }

   public void a(ib<ek> $$0, ek $$1) {
      btt $$2 = bts.a();
      $$2.a(() -> "function " + $$0.a());

      try {
         id<ek> $$3 = $$0.a(null, this.a());
         el.a($$1, $$2x -> ho.a($$2x, $$3, $$1, eh.a));
      } catch (en var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(ams $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(ams $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public ek c() {
      return this.d.aH().a(2).a();
   }

   public Optional<ib<ek>> a(ame $$0) {
      return this.g.a($$0);
   }

   public List<ib<ek>> b(ame $$0) {
      return this.g.b($$0);
   }

   public Iterable<ame> d() {
      return this.g.a().keySet();
   }

   public Iterable<ame> e() {
      return this.g.b();
   }
}
