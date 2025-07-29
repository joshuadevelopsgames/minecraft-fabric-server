import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ie<T extends em<T>> implements ib<T> {
   private static final DecimalFormat a = ag.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, id<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final ame e;
   private final List<ie.a<T>> f;

   public ie(ame $$0, List<ie.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public ame a() {
      return this.e;
   }

   @Override
   public id<T> a(@Nullable ui $$0, CommandDispatcher<T> $$1) throws en {
      if ($$0 == null) {
         throw new en(xo.a("commands.function.error.missing_arguments", xo.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            vi $$4 = $$0.a($$3);
            if ($$4 == null) {
               throw new en(xo.a("commands.function.error.missing_argument", xo.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         id<T> $$5 = (id<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            id<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(vi $$0) {
      return switch ($$0) {
         case ul var3 -> {
            ul var39 = var3;

            try {
               var40 = var39.n();
            } catch (Throwable var23) {
               throw new MatchException(var23.toString(), var23);
            }

            float var24 = var40;
            yield a.format(var24);
         }
         case uj var5 -> {
            uj var37 = var5;

            try {
               var38 = var37.n();
            } catch (Throwable var22) {
               throw new MatchException(var22.toString(), var22);
            }

            double var25 = var38;
            yield a.format(var25);
         }
         case ug var8 -> {
            ug var35 = var8;

            try {
               var36 = var35.n();
            } catch (Throwable var21) {
               throw new MatchException(var21.toString(), var21);
            }

            byte var26 = var36;
            yield String.valueOf((int)var26);
         }
         case vb var10 -> {
            vb var33 = var10;

            try {
               var34 = var33.n();
            } catch (Throwable var20) {
               throw new MatchException(var20.toString(), var20);
            }

            short var27 = var34;
            yield String.valueOf((int)var27);
         }
         case uq var12 -> {
            uq var31 = var12;

            try {
               var32 = var31.n();
            } catch (Throwable var19) {
               throw new MatchException(var19.toString(), var19);
            }

            long var28 = var32;
            yield String.valueOf(var28);
         }
         case vg var15 -> {
            vg var29 = var15;

            try {
               var30 = var29.k();
            } catch (Throwable var18) {
               throw new MatchException(var18.toString(), var18);
            }

            String var17 = var30;
            yield var17;
         }
         default -> $$0.toString();
      };
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private id<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws en {
      List<hs<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (ie.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new ig<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      hs<T> a(List<String> var1, CommandDispatcher<T> var2, ame var3) throws en;
   }

   static class b<T extends em<T>> implements ie.a<T> {
      private final ih a;
      private final IntList b;
      private final T c;

      public b(ih $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public hs<T> a(List<String> $$0, CommandDispatcher<T> $$1, ame $$2) throws en {
         String $$3 = this.a.a($$0);

         try {
            return ib.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new en(xo.a("commands.function.error.parse", xo.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements ie.a<T> {
      private final hs<T> a;

      public c(hs<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public hs<T> a(List<String> $$0, CommandDispatcher<T> $$1, ame $$2) {
         return this.a;
      }
   }
}
