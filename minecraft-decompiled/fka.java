import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fka {
   private static final Map<String, fka> a = Maps.newHashMap();
   private static final Map<String, fka> p = Maps.newHashMap();
   public static final Codec<fka> b = Codec.STRING
      .comapFlatMap($$0 -> a($$0).<DataResult>map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + $$0)), fka::d);
   public static final fka c = b("dummy");
   public static final fka d = b("trigger");
   public static final fka e = b("deathCount");
   public static final fka f = b("playerKillCount");
   public static final fka g = b("totalKillCount");
   public static final fka h = a("health", true, fka.a.b);
   public static final fka i = a("food", true, fka.a.a);
   public static final fka j = a("air", true, fka.a.a);
   public static final fka k = a("armor", true, fka.a.a);
   public static final fka l = a("xp", true, fka.a.a);
   public static final fka m = a("level", true, fka.a.a);
   public static final fka[] n = new fka[]{
      b("teamkill." + o.a.g()),
      b("teamkill." + o.b.g()),
      b("teamkill." + o.c.g()),
      b("teamkill." + o.d.g()),
      b("teamkill." + o.e.g()),
      b("teamkill." + o.f.g()),
      b("teamkill." + o.g.g()),
      b("teamkill." + o.h.g()),
      b("teamkill." + o.i.g()),
      b("teamkill." + o.j.g()),
      b("teamkill." + o.k.g()),
      b("teamkill." + o.l.g()),
      b("teamkill." + o.m.g()),
      b("teamkill." + o.n.g()),
      b("teamkill." + o.o.g()),
      b("teamkill." + o.p.g())
   };
   public static final fka[] o = new fka[]{
      b("killedByTeam." + o.a.g()),
      b("killedByTeam." + o.b.g()),
      b("killedByTeam." + o.c.g()),
      b("killedByTeam." + o.d.g()),
      b("killedByTeam." + o.e.g()),
      b("killedByTeam." + o.f.g()),
      b("killedByTeam." + o.g.g()),
      b("killedByTeam." + o.h.g()),
      b("killedByTeam." + o.i.g()),
      b("killedByTeam." + o.j.g()),
      b("killedByTeam." + o.k.g()),
      b("killedByTeam." + o.l.g()),
      b("killedByTeam." + o.m.g()),
      b("killedByTeam." + o.n.g()),
      b("killedByTeam." + o.o.g()),
      b("killedByTeam." + o.p.g())
   };
   private final String q;
   private final boolean r;
   private final fka.a s;

   private static fka a(String $$0, boolean $$1, fka.a $$2) {
      fka $$3 = new fka($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fka b(String $$0) {
      return a($$0, false, fka.a.a);
   }

   protected fka(String $$0) {
      this($$0, false, fka.a.a);
   }

   protected fka(String $$0, boolean $$1, fka.a $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      p.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fka> a(String $$0) {
      fka $$1 = p.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mm.v.b(ame.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ame.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fka> a(azi<T> $$0, ame $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.q;
   }

   public boolean e() {
      return this.r;
   }

   public fka.a f() {
      return this.s;
   }

   public static enum a implements bda {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bda.a<fka.a> c = bda.a(fka.a::values);

      private a(final String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }

      public static fka.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
