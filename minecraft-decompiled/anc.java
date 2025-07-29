import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class anc {
   private static final Logger a = LogUtils.getLogger();

   public static <D, R> CompletableFuture<R> a(anc.c $$0, anc.f<D> $$1, anc.e<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<dns, axe> $$5 = $$0.a.a();
         axe $$6 = (axe)$$5.getSecond();
         js<amn> $$7 = amn.a();
         List<jy.a<?>> $$8 = baf.a($$6, $$7.a(amn.a));
         jz.b $$9 = $$7.b(amn.b);
         List<jn.b<?>> $$10 = baf.a($$9, $$8);
         jz.b $$11 = alz.a($$6, $$10, alz.a);
         List<jn.b<?>> $$12 = Stream.concat($$10.stream(), $$11.c()).toList();
         jz.b $$13 = alz.a($$6, $$12, alz.b);
         dns $$14 = (dns)$$5.getFirst();
         jn.a $$15 = jn.a.a($$12.stream());
         anc.b<D> $$16 = $$1.get(new anc.a($$6, $$14, $$15, $$13));
         js<amn> $$17 = $$7.a(amn.b, $$11, $$16.b);
         return amp.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
            if ($$2x != null) {
               $$6.close();
            }
         }).thenApplyAsync($$4x -> {
            $$4x.g();
            return $$2.create($$6, $$4x, $$17, $$16.a);
         }, $$4);
      } catch (Exception var18) {
         return CompletableFuture.failedFuture(var18);
      }
   }

   public record a(axo a, dns b, jn.a c, jz.b d) {
   }

   public record b<D>(D a, jz.b b) {
   }

   public record c(anc.d a, el.a b, int c) {
   }

   public record d(awz a, dns b, boolean c, boolean d) {
      public Pair<dns, axe> a() {
         dns $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
         List<awb> $$1 = this.a.h();
         axe $$2 = new axh(awd.b, $$1);
         return Pair.of($$0, $$2);
      }

      public awz b() {
         return this.a;
      }

      public dns c() {
         return this.b;
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }

   @FunctionalInterface
   public interface e<D, R> {
      R create(axe var1, amp var2, js<amn> var3, D var4);
   }

   @FunctionalInterface
   public interface f<D> {
      anc.b<D> get(anc.a var1);
   }
}
