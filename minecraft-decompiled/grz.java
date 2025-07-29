import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class grz {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xo c;
   public xo d;
   @Nullable
   public alb.b e;
   public long f;
   public int g = ac.b().d();
   public xo h = xo.b(ac.b().c());
   public List<xo> i = Collections.emptyList();
   private grz.a l = grz.a.c;
   @Nullable
   private byte[] m;
   private grz.c n;
   private grz.b o = grz.b.a;

   public grz(String $$0, String $$1, grz.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public ui a() {
      ui $$0 = new ui();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      $$0.b("icon", bbi.u, this.m);
      $$0.a(grz.a.d, this.l);
      return $$0;
   }

   public grz.a b() {
      return this.l;
   }

   public void a(grz.a $$0) {
      this.l = $$0;
   }

   public static grz a(ui $$0) {
      grz $$1 = new grz($$0.b("name", ""), $$0.b("ip", ""), grz.c.c);
      $$1.a($$0.<byte[]>a("icon", bbi.u).orElse(null));
      $$1.a($$0.<grz.a>a(grz.a.d).orElse(grz.a.c));
      return $$1;
   }

   @Nullable
   public byte[] c() {
      return this.m;
   }

   public void a(@Nullable byte[] $$0) {
      this.m = $$0;
   }

   public boolean d() {
      return this.n == grz.c.a;
   }

   public boolean e() {
      return this.n == grz.c.b;
   }

   public grz.c f() {
      return this.n;
   }

   public void a(grz $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(grz $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public grz.b g() {
      return this.o;
   }

   public void a(grz.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            bch $$1 = bch.a($$0);
            if ($$1.a() <= 1024 && $$1.b() <= 1024) {
               return $$0;
            }
         } catch (IOException var2) {
            j.warn("Failed to decode server icon", var2);
         }
      }

      return null;
   }

   public static enum a {
      a("enabled"),
      b("disabled"),
      c("prompt");

      public static final MapCodec<grz.a> d = Codec.BOOL.optionalFieldOf("acceptTextures").xmap($$0 -> $$0.<grz.a>map($$0x -> $$0x ? a : b).orElse(c), $$0 -> {
         return switch ($$0) {
            case a -> Optional.of(true);
            case b -> Optional.of(false);
            case c -> Optional.empty();
         };
      });
      private final xo e;

      private a(final String $$0) {
         this.e = xo.c("addServer.resourcePack." + $$0);
      }

      public xo a() {
         return this.e;
      }
   }

   public static enum b {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum c {
      a,
      b,
      c;
   }
}
