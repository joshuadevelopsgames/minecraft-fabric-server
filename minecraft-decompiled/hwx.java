import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hwx extends axt<hwx.a> {
   public static final ame a = ame.b("empty");
   public static final hvo b = new hvo(a, bwk.a(1.0F), bwk.a(1.0F), 1, hvo.a.a, false, false, 16);
   public static final ame c = ame.b("intentionally_empty");
   public static final hwy d = new hwy(c, null);
   public static final hvo e = new hvo(c, bwk.a(1.0F), bwk.a(1.0F), 1, hvo.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeAdapter(hvp.class, new hvq()).create();
   private static final TypeToken<Map<String, hvp>> i = new TypeToken<Map<String, hvp>>() {};
   private final Map<ame, hwy> j = Maps.newHashMap();
   private final hwu k;
   private final Map<ame, axm> l = new HashMap<>();

   public hwx(fui $$0, hws $$1) {
      this.k = new hwu($$1, this, $$0, axr.fromMap(this.l));
   }

   protected hwx.a a(axo $$0, btt $$1) {
      hwx.a $$2 = new hwx.a();

      try (bty $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bty $$5 = $$1.d($$4)) {
            for (axm $$7 : $$0.a(ame.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hvp> $$9 = bbq.b(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hvp> $$10 : $$9.entrySet()) {
                     $$2.a(ame.a($$4, $$10.getKey()), $$10.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var19) {
                  f.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$7.b(), var19});
               }

               $$1.c();
            }
         } catch (IOException var21) {
         }
      }

      return $$2;
   }

   protected void a(hwx.a $$0, axo $$1, btt $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ac.aZ) {
         for (ame $$3 : this.j.keySet()) {
            hwy $$4 = this.j.get($$3);
            if (!xr.b($$4.a()) && mm.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (ame $$5 : this.j.keySet()) {
            if (!mm.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.g();
   }

   public flk b() {
      return this.k.h();
   }

   static boolean a(hvo $$0, ame $$1, axr $$2) {
      ame $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hwy a(ame $$0) {
      return this.j.get($$0);
   }

   public Collection<ame> c() {
      return this.j.keySet();
   }

   public void a(hvs $$0) {
      this.k.a($$0);
   }

   public hwu.b a(hvr $$0) {
      return this.k.c($$0);
   }

   public void a(hvr $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(ftm $$0) {
      this.k.a($$0);
   }

   public void a(aza... $$0) {
      this.k.a($$0);
   }

   public void d() {
      this.k.d();
   }

   public void e() {
      this.k.b();
   }

   public void f() {
      this.k.c();
   }

   public void a(boolean $$0) {
      this.k.a($$0);
   }

   public void g() {
      this.k.e();
   }

   public void a(aza $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public void b(hvr $$0) {
      this.k.a($$0);
   }

   public void a(hvr $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hvr $$0) {
      return this.k.b($$0);
   }

   public void a(hww $$0) {
      this.k.a($$0);
   }

   public void b(hww $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable ame $$0, @Nullable aza $$1) {
      this.k.a($$0, $$1);
   }

   public String h() {
      return this.k.f();
   }

   public void i() {
      this.k.a();
   }

   protected static class a {
      final Map<ame, hwy> a = Maps.newHashMap();
      private Map<ame, axm> b = Map.of();

      void a(axo $$0) {
         this.b = hvo.a.a($$0);
      }

      void a(ame $$0, hvp $$1) {
         hwy $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hwx.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hwy($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         axr $$4 = axr.fromMap(this.b);

         for (final hvo $$5 : $$1.a()) {
            final ame $$6 = $$5.a();
            hwz<hvo> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hwx.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hwz<hvo>() {
                     @Override
                     public int e() {
                        hwy $$0x = a.this.a.get($$6);
                        return $$0x == null ? 0 : $$0x.e();
                     }

                     public hvo a(bck $$0) {
                        hwy $$1x = a.this.a.get($$6);
                        if ($$1x == null) {
                           return hwx.b;
                        } else {
                           hvo $$2x = $$1x.a($$0);
                           return new hvo(
                              $$2x.a(), new bwq($$2x.c(), $$5.c()), new bwq($$2x.d(), $$5.d()), $$5.e(), hvo.a.a, $$2x.g() || $$5.g(), $$2x.h(), $$2x.i()
                           );
                        }
                     }

                     @Override
                     public void a(hwu $$0) {
                        hwy $$1x = a.this.a.get($$6);
                        if ($$1x != null) {
                           $$1x.a($$0);
                        }
                     }
                  };
                  break;
               default:
                  throw new IllegalStateException("Unknown SoundEventRegistration type: " + $$5.f());
            }

            $$2.a($$8);
         }
      }

      public void a(Map<ame, hwy> $$0, Map<ame, axm> $$1, hwu $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ame, hwy> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
