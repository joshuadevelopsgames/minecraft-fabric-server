import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cfs<F extends K1, Value> {
   cjo<Value> a();

   cjp b();

   @Nullable
   cfr<F, Value> a(cbm<?> var1, Optional<Value> var2);

   public record a<Value>(cjo<Value> a) implements cfs<Mu<Unit>, Value> {
      @Override
      public cjp b() {
         return cjp.b;
      }

      @Override
      public cfr<Mu<Unit>, Value> a(cbm<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new cfr<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public record b<Value>(cjo<Value> a) implements cfs<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cjp b() {
         return cjp.a;
      }

      @Override
      public cfr<com.mojang.datafixers.kinds.IdF.Mu, Value> a(cbm<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new cfr<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public record c<Value>(cjo<Value> a) implements cfs<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cjp b() {
         return cjp.c;
      }

      @Override
      public cfr<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(cbm<?> $$0, Optional<Value> $$1) {
         return new cfr<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
