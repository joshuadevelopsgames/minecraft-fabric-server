import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class huj {
   public static final huj a = new huj(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
   private final List<gyv> b;
   private final List<gyv> c;
   private final List<gyv> d;
   private final List<gyv> e;
   private final List<gyv> f;
   private final List<gyv> g;
   private final List<gyv> h;
   private final List<gyv> i;

   huj(List<gyv> $$0, List<gyv> $$1, List<gyv> $$2, List<gyv> $$3, List<gyv> $$4, List<gyv> $$5, List<gyv> $$6, List<gyv> $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public List<gyv> a(@Nullable jh $$0) {
      return switch ($$0) {
         case null -> this.c;
         case NORTH -> this.d;
         case SOUTH -> this.e;
         case EAST -> this.f;
         case WEST -> this.g;
         case UP -> this.h;
         case DOWN -> this.i;
         default -> throw new MatchException(null, null);
      };
   }

   public List<gyv> a() {
      return this.b;
   }

   public static class a {
      private final Builder<gyv> a = ImmutableList.builder();
      private final Multimap<jh, gyv> b = ArrayListMultimap.create();

      public huj.a a(jh $$0, gyv $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public huj.a a(gyv $$0) {
         this.a.add($$0);
         return this;
      }

      private static huj a(List<gyv> $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = 0;
         int var16;
         List<gyv> $$9 = $$0.subList($$8, var16 = $$8 + $$1);
         List<gyv> $$10 = $$0.subList(var16, $$8 = var16 + $$2);
         int var18;
         List<gyv> $$11 = $$0.subList($$8, var18 = $$8 + $$3);
         List<gyv> $$12 = $$0.subList(var18, $$8 = var18 + $$4);
         int var20;
         List<gyv> $$13 = $$0.subList($$8, var20 = $$8 + $$5);
         List<gyv> $$14 = $$0.subList(var20, $$8 = var20 + $$6);
         List<gyv> $$15 = $$0.subList($$8, $$8 + $$7);
         return new huj($$0, $$9, $$10, $$11, $$12, $$13, $$14, $$15);
      }

      public huj a() {
         ImmutableList<gyv> $$0 = this.a.build();
         if (this.b.isEmpty()) {
            return $$0.isEmpty() ? huj.a : new huj($$0, $$0, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
         } else {
            Builder<gyv> $$1 = ImmutableList.builder();
            $$1.addAll($$0);
            Collection<gyv> $$2 = this.b.get(jh.c);
            $$1.addAll($$2);
            Collection<gyv> $$3 = this.b.get(jh.d);
            $$1.addAll($$3);
            Collection<gyv> $$4 = this.b.get(jh.f);
            $$1.addAll($$4);
            Collection<gyv> $$5 = this.b.get(jh.e);
            $$1.addAll($$5);
            Collection<gyv> $$6 = this.b.get(jh.b);
            $$1.addAll($$6);
            Collection<gyv> $$7 = this.b.get(jh.a);
            $$1.addAll($$7);
            return a($$1.build(), $$0.size(), $$2.size(), $$3.size(), $$4.size(), $$5.size(), $$6.size(), $$7.size());
         }
      }
   }
}
