import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class fek extends few {
   public static final MapCodec<fek> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and($$0.group(fhh.a.fieldOf("source").forGetter($$0x -> $$0x.b), fek.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
         .apply($$0, fek::new)
   );
   private final fhg b;
   private final List<fek.b> c;

   fek(List<fgs> $$0, fhg $$1, List<fek.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fey<fek> b() {
      return fez.C;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.b();
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      vi $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ui> $$3 = new MutableObject();
         Supplier<vi> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kq.b, dfd.a).d());
            }

            return (vi)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ui $$5 = (ui)$$3.getValue();
         if ($$5 != null) {
            dfd.a(kq.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static fek.a a(fhg $$0) {
      return new fek.a($$0);
   }

   public static fek.a a(fdj.b $$0) {
      return new fek.a(fhe.a($$0));
   }

   public static class a extends few.a<fek.a> {
      private final fhg a;
      private final List<fek.b> b = Lists.newArrayList();

      a(fhg $$0) {
         this.a = $$0;
      }

      public fek.a a(String $$0, String $$1, fek.c $$2) {
         try {
            this.b.add(new fek.b(fe.g.a($$0), fe.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public fek.a a(String $$0, String $$1) {
         return this.a($$0, $$1, fek.c.a);
      }

      protected fek.a a() {
         return this;
      }

      @Override
      public fex b() {
         return new fek(this.g(), this.a, this.b);
      }
   }

   record b(fe.g b, fe.g c, fek.c d) {
      public static final Codec<fek.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fe.g.a.fieldOf("source").forGetter(fek.b::a), fe.g.a.fieldOf("target").forGetter(fek.b::b), fek.c.d.fieldOf("op").forGetter(fek.b::c))
            .apply($$0, fek.b::new)
      );

      public void a(Supplier<vi> $$0, vi $$1) {
         try {
            List<vi> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fe.g a() {
         return this.b;
      }

      public fe.g b() {
         return this.c;
      }

      public fek.c c() {
         return this.d;
      }
   }

   public static enum c implements bda {
      a("replace") {
         @Override
         public void a(vi $$0, fe.g $$1, List<vi> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vi)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vi $$0, fe.g $$1, List<vi> $$2) throws CommandSyntaxException {
            List<vi> $$3 = $$1.a($$0, uo::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uo) {
                  $$2.forEach($$1xx -> ((uo)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vi $$0, fe.g $$1, List<vi> $$2) throws CommandSyntaxException {
            List<vi> $$3 = $$1.a($$0, ui::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ui) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ui) {
                        ((ui)$$1x).a((ui)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<fek.c> d = bda.a(fek.c::values);
      private final String e;

      public abstract void a(vi var1, fe.g var2, List<vi> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
