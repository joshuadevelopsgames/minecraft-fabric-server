import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fgc {
   private static final BiMap<ame, bdo> y = HashBiMap.create();
   public static final Codec<bdo> a = ame.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bdo)y.get($$0))
            .<DataResult>map(DataResult::success)
            .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bdo b = a("empty", $$0 -> {});
   public static final bdo c = a("chest", $$0 -> $$0.a(fgd.f).b(fgd.a));
   public static final bdo d = a("command", $$0 -> $$0.a(fgd.f).b(fgd.a));
   public static final bdo e = a("selector", $$0 -> $$0.a(fgd.f).a(fgd.a));
   public static final bdo f = a("fishing", $$0 -> $$0.a(fgd.f).a(fgd.i).b(fgd.a));
   public static final bdo g = a("entity", $$0 -> $$0.a(fgd.a).a(fgd.f).a(fgd.c).b(fgd.d).b(fgd.e).b(fgd.b));
   public static final bdo h = a("equipment", $$0 -> $$0.a(fgd.f).a(fgd.a));
   public static final bdo i = a("archaeology", $$0 -> $$0.a(fgd.f).a(fgd.a).a(fgd.i));
   public static final bdo j = a("gift", $$0 -> $$0.a(fgd.f).a(fgd.a));
   public static final bdo k = a("barter", $$0 -> $$0.a(fgd.a));
   public static final bdo l = a("vault", $$0 -> $$0.a(fgd.f).b(fgd.a).b(fgd.i));
   public static final bdo m = a("advancement_reward", $$0 -> $$0.a(fgd.a).a(fgd.f));
   public static final bdo n = a("advancement_entity", $$0 -> $$0.a(fgd.a).a(fgd.f));
   public static final bdo o = a("advancement_location", $$0 -> $$0.a(fgd.a).a(fgd.f).a(fgd.i).a(fgd.g));
   public static final bdo p = a("block_use", $$0 -> $$0.a(fgd.a).a(fgd.f).a(fgd.g));
   public static final bdo q = a("generic", $$0 -> $$0.a(fgd.a).a(fgd.b).a(fgd.c).a(fgd.d).a(fgd.e).a(fgd.f).a(fgd.g).a(fgd.h).a(fgd.i).a(fgd.j));
   public static final bdo r = a("block", $$0 -> $$0.a(fgd.g).a(fgd.f).a(fgd.i).b(fgd.a).b(fgd.h).b(fgd.j));
   public static final bdo s = a("shearing", $$0 -> $$0.a(fgd.f).a(fgd.a).a(fgd.i));
   public static final bdo t = a("enchanted_damage", $$0 -> $$0.a(fgd.a).a(fgd.k).a(fgd.f).a(fgd.c).b(fgd.e).b(fgd.d));
   public static final bdo u = a("enchanted_item", $$0 -> $$0.a(fgd.i).a(fgd.k));
   public static final bdo v = a("enchanted_location", $$0 -> $$0.a(fgd.a).a(fgd.k).a(fgd.f).a(fgd.l));
   public static final bdo w = a("enchanted_entity", $$0 -> $$0.a(fgd.a).a(fgd.k).a(fgd.f));
   public static final bdo x = a("hit_block", $$0 -> $$0.a(fgd.a).a(fgd.k).a(fgd.f).a(fgd.g));

   private static bdo a(String $$0, Consumer<bdo.a> $$1) {
      bdo.a $$2 = new bdo.a();
      $$1.accept($$2);
      bdo $$3 = $$2.a();
      ame $$4 = ame.b($$0);
      bdo $$5 = (bdo)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
