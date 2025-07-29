import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cwl extends fbx {
   private static final String d = "raids";
   public static final Codec<cwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            cwl.a.a.listOf().optionalFieldOf("raids", List.of()).forGetter($$0x -> $$0x.e.int2ObjectEntrySet().stream().map(cwl.a::a).toList()),
            Codec.INT.fieldOf("next_id").forGetter($$0x -> $$0x.f),
            Codec.INT.fieldOf("tick").forGetter($$0x -> $$0x.g)
         )
         .apply($$0, cwl::new)
   );
   public static final fby<cwl> b = new fby<>("raids", cwl::new, a, bdr.m);
   public static final fby<cwl> c = new fby<>("raids_end", cwl::new, a, bdr.m);
   private final Int2ObjectMap<cwj> e = new Int2ObjectOpenHashMap();
   private int f = 1;
   private int g;

   public static fby<cwl> a(jl<ehy> $$0) {
      return $$0.a(ehw.c) ? c : b;
   }

   public cwl() {
      this.e();
   }

   private cwl(List<cwl.a> $$0, int $$1, int $$2) {
      for (cwl.a $$3 : $$0) {
         this.e.put($$3.b, $$3.c);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public cwj a(int $$0) {
      return (cwj)this.e.get($$0);
   }

   public OptionalInt a(cwj $$0) {
      ObjectIterator var2 = this.e.int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<cwj> $$1 = (Entry<cwj>)var2.next();
         if ($$1.getValue() == $$0) {
            return OptionalInt.of($$1.getIntKey());
         }
      }

      return OptionalInt.empty();
   }

   public void a(aub $$0) {
      this.g++;
      Iterator<cwj> $$1 = this.e.values().iterator();

      while ($$1.hasNext()) {
         cwj $$2 = $$1.next();
         if ($$0.P().c(dmq.D)) {
            $$2.m();
         }

         if ($$2.d()) {
            $$1.remove();
            this.e();
         } else {
            $$2.a($$0);
         }
      }

      if (this.g % 200 == 0) {
         this.e();
      }

      ahj.a($$0, this.e.values());
   }

   public static boolean a(cwk $$0) {
      return $$0.bO() && $$0.gT() && $$0.eB() <= 2400;
   }

   @Nullable
   public cwj a(auc $$0, jb $$1) {
      if ($$0.am()) {
         return null;
      } else {
         aub $$2 = $$0.y();
         if ($$2.P().c(dmq.D)) {
            return null;
         } else {
            ehy $$3 = $$2.G_();
            if (!$$3.c()) {
               return null;
            } else {
               List<clq> $$4 = $$2.B().c($$0x -> $$0x.a(azz.b), $$1, 64, clp.b.b).toList();
               int $$5 = 0;
               fis $$6 = fis.c;

               for (clq $$7 : $$4) {
                  jb $$8 = $$7.g();
                  $$6 = $$6.b($$8.u(), $$8.v(), $$8.w());
                  $$5++;
               }

               jb $$9;
               if ($$5 > 0) {
                  $$6 = $$6.c(1.0 / $$5);
                  $$9 = jb.a((jv)$$6);
               } else {
                  $$9 = $$1;
               }

               cwj $$11 = this.a($$2, $$9);
               if (!$$11.i() && !this.e.containsValue($$11)) {
                  this.e.put(this.a(), $$11);
               }

               if (!$$11.i() || $$11.l() < $$11.k()) {
                  $$11.a($$0);
               }

               this.e();
               return $$11;
            }
         }
      }
   }

   private cwj a(aub $$0, jb $$1) {
      cwj $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cwj($$1, $$0.an());
   }

   public static cwl a(ui $$0) {
      return a.parse(uw.a, $$0).resultOrPartial().orElseGet(cwl::new);
   }

   private int a() {
      return ++this.f;
   }

   @Nullable
   public cwj a(jb $$0, int $$1) {
      cwj $$2 = null;
      double $$3 = $$1;
      ObjectIterator var6 = this.e.values().iterator();

      while (var6.hasNext()) {
         cwj $$4 = (cwj)var6.next();
         double $$5 = $$4.q().j($$0);
         if ($$4.r() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }

   record a(int b, cwj c) {
      public static final Codec<cwl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("id").forGetter(cwl.a::a), cwj.b.forGetter(cwl.a::b)).apply($$0, cwl.a::new)
      );

      public static cwl.a a(Entry<cwj> $$0) {
         return new cwl.a($$0.getIntKey(), (cwj)$$0.getValue());
      }

      public int a() {
         return this.b;
      }

      public cwj b() {
         return this.c;
      }
   }
}
