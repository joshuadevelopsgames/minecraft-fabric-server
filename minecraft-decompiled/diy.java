import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface diy {
   Codec<diy> a = mm.ay.q().dispatch(diy::a, diy.i::a);
   zm<wx, diy> b = zk.a(mn.ar).b(diy::a, diy.i::b);

   <T> Stream<T> a(bdp var1, diq<T> var2);

   diy.i<? extends diy> a();

   default boolean a(cyd $$0) {
      return true;
   }

   default List<dcv> a(bdp $$0) {
      return this.a($$0, diy.e.a).toList();
   }

   default dcv b(bdp $$0) {
      return this.a($$0, diy.e.a).findFirst().orElse(dcv.l);
   }

   public static class a implements diy {
      public static final diy.a c = new diy.a();
      public static final MapCodec<diy.a> d = MapCodec.unit(c);
      public static final zm<wx, diy.a> e = zm.a(c);
      public static final diy.i<diy.a> f = new diy.i<>(d, e);

      private a() {
      }

      @Override
      public diy.i<diy.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bdp $$0, diq<T> $$1) {
         if ($$1 instanceof diq.b<T> $$2) {
            eby $$3 = $$0.c(diz.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public record b(List<diy> f) implements diy {
      public static final MapCodec<diy.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(diy.a.listOf().fieldOf("contents").forGetter(diy.b::b)).apply($$0, diy.b::new)
      );
      public static final zm<wx, diy.b> d = zm.a(diy.b.a(zk.a()), diy.b::b, diy.b::new);
      public static final diy.i<diy.b> e = new diy.i<>(c, d);

      @Override
      public diy.i<diy.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bdp $$0, diq<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cyd $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<diy> b() {
         return this.f;
      }
   }

   public static class c implements diy {
      public static final diy.c c = new diy.c();
      public static final MapCodec<diy.c> d = MapCodec.unit(c);
      public static final zm<wx, diy.c> e = zm.a(c);
      public static final diy.i<diy.c> f = new diy.i<>(d, e);

      private c() {
      }

      @Override
      public diy.i<diy.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bdp $$0, diq<T> $$1) {
         return Stream.empty();
      }
   }

   public record d(jl<dcr> f) implements diy {
      public static final MapCodec<diy.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcr.e.fieldOf("item").forGetter(diy.d::b)).apply($$0, diy.d::new));
      public static final zm<wx, diy.d> d = zm.a(dcr.f, diy.d::b, diy.d::new);
      public static final diy.i<diy.d> e = new diy.i<>(c, d);

      public d(dcr $$0) {
         this($$0.e());
      }

      @Override
      public diy.i<diy.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bdp $$0, diq<T> $$1) {
         return $$1 instanceof diq.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cyd $$0) {
         return this.f.a().a($$0);
      }

      public jl<dcr> b() {
         return this.f;
      }
   }

   public static class e implements diq.b<dcv> {
      public static final diy.e a = new diy.e();

      public dcv b(dcv $$0) {
         return $$0;
      }
   }

   public record f(dcv f) implements diy {
      public static final MapCodec<diy.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcv.d.fieldOf("item").forGetter(diy.f::b)).apply($$0, diy.f::new));
      public static final zm<wx, diy.f> d = zm.a(dcv.j, diy.f::b, diy.f::new);
      public static final diy.i<diy.f> e = new diy.i<>(c, d);

      @Override
      public diy.i<diy.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bdp $$0, diq<T> $$1) {
         return $$1 instanceof diq.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 || $$0 instanceof diy.f $$1 && dcv.a(this.f, $$1.f);
      }

      @Override
      public boolean a(cyd $$0) {
         return this.f.h().a($$0);
      }

      public dcv b() {
         return this.f;
      }
   }

   public record g(diy f, diy g, jl<dlk> h) implements diy {
      public static final MapCodec<diy.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               diy.a.fieldOf("base").forGetter(diy.g::b), diy.a.fieldOf("material").forGetter(diy.g::c), dlk.c.fieldOf("pattern").forGetter(diy.g::d)
            )
            .apply($$0, diy.g::new)
      );
      public static final zm<wx, diy.g> d = zm.a(diy.b, diy.g::b, diy.b, diy.g::c, dlk.d, diy.g::d, diy.g::new);
      public static final diy.i<diy.g> e = new diy.i<>(c, d);

      @Override
      public diy.i<diy.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bdp $$0, diq<T> $$1) {
         if ($$1 instanceof diq.b<T> $$2) {
            jn.a $$3 = $$0.c(diz.b);
            if ($$3 != null) {
               bck $$4 = bck.a((long)System.identityHashCode(this));
               List<dcv> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<dcv> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<dcv>generate(() -> {
                  dcv $$4x = ag.a($$5, $$4);
                  dcv $$5x = ag.a($$6, $$4);
                  return dik.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public diy b() {
         return this.f;
      }

      public diy c() {
         return this.g;
      }

      public jl<dlk> d() {
         return this.h;
      }
   }

   public record h(bae<dcr> f) implements diy {
      public static final MapCodec<diy.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(bae.a(mn.N).fieldOf("tag").forGetter(diy.h::b)).apply($$0, diy.h::new)
      );
      public static final zm<wx, diy.h> d = zm.a(bae.c(mn.N), diy.h::b, diy.h::new);
      public static final diy.i<diy.h> e = new diy.i<>(c, d);

      @Override
      public diy.i<diy.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bdp $$0, diq<T> $$1) {
         if ($$1 instanceof diq.b<T> $$2) {
            jn.a $$3 = $$0.c(diz.b);
            if ($$3 != null) {
               return $$3.e(mn.N).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public bae<dcr> b() {
         return this.f;
      }
   }

   public record i<T extends diy>(MapCodec<T> a, zm<wx, T> b) {
   }

   public record j(diy f, diy g) implements diy {
      public static final MapCodec<diy.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(diy.a.fieldOf("input").forGetter(diy.j::b), diy.a.fieldOf("remainder").forGetter(diy.j::c)).apply($$0, diy.j::new)
      );
      public static final zm<wx, diy.j> d = zm.a(diy.b, diy.j::b, diy.b, diy.j::c, diy.j::new);
      public static final diy.i<diy.j> e = new diy.i<>(c, d);

      @Override
      public diy.i<diy.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bdp $$0, diq<T> $$1) {
         if ($$1 instanceof diq.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cyd $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public diy b() {
         return this.f;
      }

      public diy c() {
         return this.g;
      }
   }
}
