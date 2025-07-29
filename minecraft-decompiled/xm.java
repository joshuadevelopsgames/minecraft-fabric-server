import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public interface xm {
   Codec<xm> a = xm.a.j.dispatch("action", xm::a, $$0 -> $$0.m);

   xm.a a();

   public static enum a implements bda {
      a("open_url", true, xm.f.b),
      b("open_file", false, xm.e.b),
      c("run_command", true, xm.g.b),
      d("suggest_command", true, xm.i.b),
      e("show_dialog", true, xm.h.b),
      f("change_page", true, xm.b.b),
      g("copy_to_clipboard", true, xm.c.b),
      h("custom", true, xm.d.b);

      public static final Codec<xm.a> i = bda.a(xm.a::values);
      public static final Codec<xm.a> j = i.validate(xm.a::a);
      private final boolean k;
      private final String l;
      final MapCodec<? extends xm> m;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xm> $$2) {
         this.l = $$0;
         this.k = $$1;
         this.m = $$2;
      }

      public boolean a() {
         return this.k;
      }

      @Override
      public String c() {
         return this.l;
      }

      public MapCodec<? extends xm> b() {
         return this.m;
      }

      public static DataResult<xm.a> a(xm.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Click event type not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public record b(int c) implements xm {
      public static final MapCodec<xm.b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.p.fieldOf("page").forGetter(xm.b::b)).apply($$0, xm.b::new));

      @Override
      public xm.a a() {
         return xm.a.f;
      }

      public int b() {
         return this.c;
      }
   }

   public record c(String c) implements xm {
      public static final MapCodec<xm.c> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("value").forGetter(xm.c::b)).apply($$0, xm.c::new)
      );

      @Override
      public xm.a a() {
         return xm.a.g;
      }

      public String b() {
         return this.c;
      }
   }

   public record d(ame c, Optional<vi> d) implements xm {
      public static final MapCodec<xm.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ame.a.fieldOf("id").forGetter(xm.d::b), bbi.c.optionalFieldOf("payload").forGetter(xm.d::c)).apply($$0, xm.d::new)
      );

      @Override
      public xm.a a() {
         return xm.a.h;
      }

      public ame b() {
         return this.c;
      }

      public Optional<vi> c() {
         return this.d;
      }
   }

   public record e(String c) implements xm {
      public static final MapCodec<xm.e> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("path").forGetter(xm.e::c)).apply($$0, xm.e::new)
      );

      public e(File $$0) {
         this($$0.toString());
      }

      public e(Path $$0) {
         this($$0.toFile());
      }

      public File b() {
         return new File(this.c);
      }

      @Override
      public xm.a a() {
         return xm.a.b;
      }
   }

   public record f(URI c) implements xm {
      public static final MapCodec<xm.f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.G.fieldOf("url").forGetter(xm.f::b)).apply($$0, xm.f::new));

      @Override
      public xm.a a() {
         return xm.a.a;
      }

      public URI b() {
         return this.c;
      }
   }

   public record g(String c) implements xm {
      public static final MapCodec<xm.g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.H.fieldOf("command").forGetter(xm.g::b)).apply($$0, xm.g::new));

      @Override
      public xm.a a() {
         return xm.a.c;
      }

      public String b() {
         return this.c;
      }
   }

   public record h(jl<art> c) implements xm {
      public static final MapCodec<xm.h> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(art.d.fieldOf("dialog").forGetter(xm.h::b)).apply($$0, xm.h::new));

      @Override
      public xm.a a() {
         return xm.a.e;
      }

      public jl<art> b() {
         return this.c;
      }
   }

   public record i(String c) implements xm {
      public static final MapCodec<xm.i> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.H.fieldOf("command").forGetter(xm.i::b)).apply($$0, xm.i::new));

      @Override
      public xm.a a() {
         return xm.a.d;
      }

      public String b() {
         return this.c;
      }
   }
}
