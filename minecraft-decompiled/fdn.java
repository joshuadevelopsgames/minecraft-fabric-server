import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class fdn {
   public static final Codec<fdn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            fdx.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
            fgs.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
            fez.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
            fhp.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
            fhp.a.fieldOf("bonus_rolls").orElse(fhl.a(0.0F)).forGetter($$0x -> $$0x.h)
         )
         .apply($$0, fdn::new)
   );
   private final List<fdz> b;
   private final List<fgs> c;
   private final Predicate<fdj> d;
   private final List<fex> e;
   private final BiFunction<dcv, fdj, dcv> f;
   private final fho g;
   private final fho h;

   fdn(List<fdz> $$0, List<fgs> $$1, List<fex> $$2, fho $$3, fho $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ag.a($$1);
      this.e = $$2;
      this.f = fez.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<dcv> $$0, fdj $$1) {
      bck $$2 = $$1.b();
      List<fdy> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (fdz $$5 : this.b) {
         $$5.expand($$1, $$3x -> {
            int $$4x = $$3x.a($$1.c());
            if ($$4x > 0) {
               $$3.add($$3x);
               $$4.add($$4x);
            }
         });
      }

      int $$6 = $$3.size();
      if ($$4.intValue() != 0 && $$6 != 0) {
         if ($$6 == 1) {
            $$3.get(0).a($$0, $$1);
         } else {
            int $$7 = $$2.a($$4.intValue());

            for (fdy $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<dcv> $$0, fdj $$1) {
      if (this.d.test($$1)) {
         Consumer<dcv> $$2 = fex.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + bcb.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(fdp $$0) {
      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(new bci.d("conditions", $$1)));
      }

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         this.e.get($$2).a($$0.a(new bci.d("functions", $$2)));
      }

      for (int $$3 = 0; $$3 < this.b.size(); $$3++) {
         this.b.get($$3).a($$0.a(new bci.d("entries", $$3)));
      }

      this.g.a($$0.a(new bci.c("rolls")));
      this.h.a($$0.a(new bci.c("bonus_rolls")));
   }

   public static fdn.a a() {
      return new fdn.a();
   }

   public static class a implements fet<fdn.a>, fgk<fdn.a> {
      private final Builder<fdz> a = ImmutableList.builder();
      private final Builder<fgs> b = ImmutableList.builder();
      private final Builder<fex> c = ImmutableList.builder();
      private fho d = fhl.a(1.0F);
      private fho e = fhl.a(0.0F);

      public fdn.a a(fho $$0) {
         this.d = $$0;
         return this;
      }

      public fdn.a a() {
         return this;
      }

      public fdn.a b(fho $$0) {
         this.e = $$0;
         return this;
      }

      public fdn.a a(fdz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public fdn.a a(fgs.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public fdn.a a(fex.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public fdn b() {
         return new fdn(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
