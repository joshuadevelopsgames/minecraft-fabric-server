import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fra {
   public final fsm a = new fsm(ag.i(), TimeUnit.MILLISECONDS, ag.c);
   private final List<fsm.e<?>> i;
   public final fsm.e<List<fpv>> b;
   public final fsm.e<fra.a> c;
   public final fsm.e<Integer> d;
   public final fsm.e<Boolean> e;
   public final fsm.e<fpu> f;
   public final fsm.e<fpz> g;
   public final frb h = new frb(new fss());

   public fra(foq $$0) {
      this.c = this.a.a("server list", () -> {
         fpy $$1 = $$0.c();
         return fol.b() ? new fra.a($$1.a, $$0.d()) : new fra.a($$1.a, List.of());
      }, Duration.ofSeconds(60L), fsn.a);
      this.d = this.a.a("pending invite count", $$0::j, Duration.ofSeconds(10L), fsn.a(360));
      this.e = this.a.a("trial availablity", $$0::n, Duration.ofSeconds(60L), fsn.a(60));
      this.f = this.a.a("unread news", $$0::m, Duration.ofMinutes(5L), fsn.a);
      this.b = this.a.a("notifications", $$0::e, Duration.ofMinutes(5L), fsn.a);
      this.g = this.a.a("online players", $$0::g, Duration.ofSeconds(10L), fsn.a);
      this.i = List.of(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public List<fsm.e<?>> a() {
      return this.i;
   }

   public record a(List<fpx> a, List<fpx> b) {
   }
}
