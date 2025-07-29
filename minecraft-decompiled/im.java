import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;

public class im {
   private static final Logger a = LogUtils.getLogger();
   private static final byte b = 1;
   private static final byte c = 2;

   public static int a(boolean $$0, boolean $$1) {
      int $$2 = 0;
      if ($$0) {
         $$2 |= 1;
      }

      if ($$1) {
         $$2 |= 2;
      }

      return $$2;
   }

   public static boolean a(byte $$0) {
      return ($$0 & 1) != 0;
   }

   public static boolean b(byte $$0) {
      return ($$0 & 2) != 0;
   }

   private static <A extends ArgumentType<?>, T extends ik.a<A>> void a(JsonObject $$0, ik<A, T> $$1, ik.a<A> $$2) {
      $$1.a((T)$$2, $$0);
   }

   private static <T extends ArgumentType<?>> void a(JsonObject $$0, T $$1) {
      ik.a<T> $$2 = il.b($$1);
      $$0.addProperty("type", "argument");
      $$0.addProperty("parser", String.valueOf(mm.u.b($$2.a())));
      JsonObject $$3 = new JsonObject();
      a($$3, $$2.a(), $$2);
      if (!$$3.isEmpty()) {
         $$0.add("properties", $$3);
      }
   }

   public static <S> JsonObject a(CommandDispatcher<S> $$0, CommandNode<S> $$1) {
      JsonObject $$2 = new JsonObject();
      switch ($$1) {
         case RootCommandNode<S> $$3:
            $$2.addProperty("type", "root");
            break;
         case LiteralCommandNode<S> $$4:
            $$2.addProperty("type", "literal");
            break;
         case ArgumentCommandNode<S, ?> $$5:
            a($$2, $$5.getType());
            break;
         default:
            a.error("Could not serialize node {} ({})!", $$1, $$1.getClass());
            $$2.addProperty("type", "unknown");
      }

      Collection<CommandNode<S>> $$6 = $$1.getChildren();
      if (!$$6.isEmpty()) {
         JsonObject $$7 = new JsonObject();

         for (CommandNode<S> $$8 : $$6) {
            $$7.add($$8.getName(), a($$0, $$8));
         }

         $$2.add("children", $$7);
      }

      if ($$1.getCommand() != null) {
         $$2.addProperty("executable", true);
      }

      if ($$1.getRequirement() instanceof aph<?> $$9) {
         $$2.addProperty("required_level", $$9.a());
      }

      if ($$1.getRedirect() != null) {
         Collection<String> $$10 = $$0.getPath($$1.getRedirect());
         if (!$$10.isEmpty()) {
            JsonArray $$11 = new JsonArray();

            for (String $$12 : $$10) {
               $$11.add($$12);
            }

            $$2.add("redirect", $$11);
         }
      }

      return $$2;
   }

   public static <T> Set<ArgumentType<?>> a(CommandNode<T> $$0) {
      Set<CommandNode<T>> $$1 = new ReferenceOpenHashSet();
      Set<ArgumentType<?>> $$2 = new HashSet<>();
      a($$0, $$2, $$1);
      return $$2;
   }

   private static <T> void a(CommandNode<T> $$0, Set<ArgumentType<?>> $$1, Set<CommandNode<T>> $$2) {
      if ($$2.add($$0)) {
         if ($$0 instanceof ArgumentCommandNode<T, ?> $$3) {
            $$1.add($$3.getType());
         }

         $$0.getChildren().forEach($$2x -> a($$2x, $$1, $$2));
         CommandNode<T> $$4 = $$0.getRedirect();
         if ($$4 != null) {
            a($$4, $$1, $$2);
         }
      }
   }
}
