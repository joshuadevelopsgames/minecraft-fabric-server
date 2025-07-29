import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.function.BiPredicate;
import javax.annotation.Nullable;

public class adi implements zw<acq> {
   public static final zm<wg, adi> a = zw.a(adi::a, adi::new);
   private static final byte b = 3;
   private static final byte c = 4;
   private static final byte d = 8;
   private static final byte e = 16;
   private static final byte f = 32;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final byte i = 2;
   private final int j;
   private final List<adi.b> k;

   public <S> adi(RootCommandNode<S> $$0, adi.e<S> $$1) {
      Object2IntMap<CommandNode<S>> $$2 = a($$0);
      this.k = a($$2, $$1);
      this.j = $$2.getInt($$0);
   }

   private adi(wg $$0) {
      this.k = $$0.a(adi::b);
      this.j = $$0.l();
      a(this.k);
   }

   private void a(wg $$0) {
      $$0.a(this.k, ($$0x, $$1) -> $$1.a($$0x));
      $$0.c(this.j);
   }

   private static void a(List<adi.b> $$0, BiPredicate<adi.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<adi.b> $$0) {
      a($$0, adi.b::a);
      a($$0, adi.b::b);
   }

   private static <S> Object2IntMap<CommandNode<S>> a(RootCommandNode<S> $$0) {
      Object2IntMap<CommandNode<S>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<S>> $$2 = new ArrayDeque<>();
      $$2.add($$0);

      CommandNode<S> $$3;
      while (($$3 = $$2.poll()) != null) {
         if (!$$1.containsKey($$3)) {
            int $$4 = $$1.size();
            $$1.put($$3, $$4);
            $$2.addAll($$3.getChildren());
            if ($$3.getRedirect() != null) {
               $$2.add($$3.getRedirect());
            }
         }
      }

      return $$1;
   }

   private static <S> List<adi.b> a(Object2IntMap<CommandNode<S>> $$0, adi.e<S> $$1) {
      ObjectArrayList<adi.b> $$2 = new ObjectArrayList($$0.size());
      $$2.size($$0.size());
      ObjectIterator var3 = Object2IntMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<CommandNode<S>> $$3 = (Entry<CommandNode<S>>)var3.next();
         $$2.set($$3.getIntValue(), a((CommandNode<S>)$$3.getKey(), $$1, $$0));
      }

      return $$2;
   }

   private static adi.b b(wg $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.l() : 0;
      adi.g $$4 = a($$0, $$1);
      return new adi.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static adi.g a(wg $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.p();
         int $$4 = $$0.l();
         ik<?, ?> $$5 = mm.u.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            ik.a<?> $$6 = $$5.b($$0);
            ame $$7 = ($$1 & 16) != 0 ? $$0.q() : null;
            return new adi.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.p();
         return new adi.c($$8);
      } else {
         return null;
      }
   }

   private static <S> adi.b a(CommandNode<S> $$0, adi.e<S> $$1, Object2IntMap<CommandNode<S>> $$2) {
      int $$3 = 0;
      int $$4;
      if ($$0.getRedirect() != null) {
         $$3 |= 8;
         $$4 = $$2.getInt($$0.getRedirect());
      } else {
         $$4 = 0;
      }

      if ($$1.a($$0)) {
         $$3 |= 4;
      }

      if ($$1.b($$0)) {
         $$3 |= 32;
      }

      adi.g $$7;
      switch ($$0) {
         case RootCommandNode<S> $$6:
            $$3 |= 0;
            $$7 = null;
            break;
         case ArgumentCommandNode<S, ?> $$8:
            ame $$9 = $$1.a($$8);
            $$7 = new adi.a($$8.getName(), il.b($$8.getType()), $$9);
            $$3 |= 2;
            if ($$9 != null) {
               $$3 |= 16;
            }
            break;
         case LiteralCommandNode<S> $$11:
            $$7 = new adi.c($$11.getLiteral());
            $$3 |= 1;
            break;
         default:
            throw new UnsupportedOperationException("Unknown node type " + $$0);
      }

      int[] $$14 = $$0.getChildren().stream().mapToInt($$2::getInt).toArray();
      return new adi.b($$7, $$3, $$4, $$14);
   }

   @Override
   public zy<adi> a() {
      return ahk.r;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public <S> RootCommandNode<S> a(eg $$0, adi.d<S> $$1) {
      return (RootCommandNode<S>)new adi.f<>($$0, $$1, this.k).a(this.j);
   }

   record a(String a, ik.a<?> b, @Nullable ame c) implements adi.g {
      @Override
      public <S> ArgumentBuilder<S, ?> a(eg $$0, adi.d<S> $$1) {
         ArgumentType<?> $$2 = this.b.b($$0);
         return $$1.a(this.a, $$2, this.c);
      }

      @Override
      public void a(wg $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(wg $$0, ik.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends ik.a<A>> void a(wg $$0, ik<A, T> $$1, ik.a<A> $$2) {
         $$0.c(mm.u.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   record b(@Nullable adi.g a, int b, int c, int[] d) {

      public void a(wg $$0) {
         $$0.l(this.b);
         $$0.a(this.d);
         if ((this.b & 8) != 0) {
            $$0.c(this.c);
         }

         if (this.a != null) {
            this.a.a($$0);
         }
      }

      public boolean a(IntSet $$0) {
         return (this.b & 8) != 0 ? !$$0.contains(this.c) : true;
      }

      public boolean b(IntSet $$0) {
         for (int $$1 : this.d) {
            if ($$0.contains($$1)) {
               return false;
            }
         }

         return true;
      }
   }

   record c(String a) implements adi.g {
      @Override
      public <S> ArgumentBuilder<S, ?> a(eg $$0, adi.d<S> $$1) {
         return $$1.a(this.a);
      }

      @Override
      public void a(wg $$0) {
         $$0.a(this.a);
      }
   }

   public interface d<S> {
      ArgumentBuilder<S, ?> a(String var1);

      ArgumentBuilder<S, ?> a(String var1, ArgumentType<?> var2, @Nullable ame var3);

      ArgumentBuilder<S, ?> a(ArgumentBuilder<S, ?> var1, boolean var2, boolean var3);
   }

   public interface e<S> {
      @Nullable
      ame a(ArgumentCommandNode<S, ?> var1);

      boolean a(CommandNode<S> var1);

      boolean b(CommandNode<S> var1);
   }

   static class f<S> {
      private final eg a;
      private final adi.d<S> b;
      private final List<adi.b> c;
      private final List<CommandNode<S>> d;

      f(eg $$0, adi.d<S> $$1, List<adi.b> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         ObjectArrayList<CommandNode<S>> $$3 = new ObjectArrayList();
         $$3.size($$2.size());
         this.d = $$3;
      }

      public CommandNode<S> a(int $$0) {
         CommandNode<S> $$1 = this.d.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            adi.b $$2 = this.c.get($$0);
            CommandNode<S> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<S, ?> $$4 = $$2.a.a(this.a, this.b);
               if (($$2.b & 8) != 0) {
                  $$4.redirect(this.a($$2.c));
               }

               boolean $$5 = ($$2.b & 4) != 0;
               boolean $$6 = ($$2.b & 32) != 0;
               $$3 = this.b.a($$4, $$5, $$6).build();
            }

            this.d.set($$0, $$3);

            for (int $$8 : $$2.d) {
               CommandNode<S> $$9 = this.a($$8);
               if (!($$9 instanceof RootCommandNode)) {
                  $$3.addChild($$9);
               }
            }

            return $$3;
         }
      }
   }

   interface g {
      <S> ArgumentBuilder<S, ?> a(eg var1, adi.d<S> var2);

      void a(wg var1);
   }
}
