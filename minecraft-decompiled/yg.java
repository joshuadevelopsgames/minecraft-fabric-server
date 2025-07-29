import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public record yg<S>(List<yg.a<S>> a) {
   public static <S> boolean a(ParseResults<S> $$0) {
      return !b($$0).a().isEmpty();
   }

   public static <S> yg<S> b(ParseResults<S> $$0) {
      String $$1 = $$0.getReader().getString();
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2;
      List<yg.a<S>> $$4 = a($$1, $$2);

      CommandContextBuilder<S> $$5;
      while (($$5 = $$3.getChild()) != null && $$5.getRootNode() != $$2.getRootNode()) {
         $$4.addAll(a($$1, $$5));
         $$3 = $$5;
      }

      return new yg<>($$4);
   }

   private static <S> List<yg.a<S>> a(String $$0, CommandContextBuilder<S> $$1) {
      List<yg.a<S>> $$2 = new ArrayList<>();

      for (ParsedCommandNode<S> $$3 : $$1.getNodes()) {
         if ($$3.getNode() instanceof ArgumentCommandNode<S, ?> $$4 && $$4.getType() instanceof fu) {
            ParsedArgument<S, ?> $$5 = (ParsedArgument<S, ?>)$$1.getArguments().get($$4.getName());
            if ($$5 != null) {
               String $$6 = $$5.getRange().get($$0);
               $$2.add(new yg.a<>($$4, $$6));
            }
         }
      }

      return $$2;
   }

   @Nullable
   public yg.a<S> a(String $$0) {
      for (yg.a<S> $$1 : this.a) {
         if ($$0.equals($$1.a())) {
            return $$1;
         }
      }

      return null;
   }

   public record a<S>(ArgumentCommandNode<S, ?> a, String b) {
      public String a() {
         return this.a.getName();
      }

      public ArgumentCommandNode<S, ?> b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }
   }
}
