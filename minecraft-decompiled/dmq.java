import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class dmq {
   public static final int a = 3;
   static final Logger af = LogUtils.getLogger();
   private static final Map<dmq.e<?>, dmq.f<?>> ag = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dmq.e<dmq.a> b = a("doFireTick", dmq.b.e, dmq.a.a(true));
   public static final dmq.e<dmq.a> c = a("allowFireTicksAwayFromPlayer", dmq.b.e, dmq.a.a(false));
   public static final dmq.e<dmq.a> d = a("mobGriefing", dmq.b.b, dmq.a.a(true));
   public static final dmq.e<dmq.a> e = a("keepInventory", dmq.b.a, dmq.a.a(false));
   public static final dmq.e<dmq.a> f = a("doMobSpawning", dmq.b.c, dmq.a.a(true));
   public static final dmq.e<dmq.a> g = a("doMobLoot", dmq.b.d, dmq.a.a(true));
   public static final dmq.e<dmq.a> h = a("projectilesCanBreakBlocks", dmq.b.d, dmq.a.a(true));
   public static final dmq.e<dmq.a> i = a("doTileDrops", dmq.b.d, dmq.a.a(true));
   public static final dmq.e<dmq.a> j = a("doEntityDrops", dmq.b.d, dmq.a.a(true));
   public static final dmq.e<dmq.a> k = a("commandBlockOutput", dmq.b.f, dmq.a.a(true));
   public static final dmq.e<dmq.a> l = a("naturalRegeneration", dmq.b.a, dmq.a.a(true));
   public static final dmq.e<dmq.a> m = a("doDaylightCycle", dmq.b.e, dmq.a.a(true));
   public static final dmq.e<dmq.a> n = a("logAdminCommands", dmq.b.f, dmq.a.a(true));
   public static final dmq.e<dmq.a> o = a("showDeathMessages", dmq.b.f, dmq.a.a(true));
   public static final dmq.e<dmq.d> p = a("randomTickSpeed", dmq.b.e, dmq.d.a(3));
   public static final dmq.e<dmq.a> q = a("sendCommandFeedback", dmq.b.f, dmq.a.a(true));
   public static final dmq.e<dmq.a> r = a("reducedDebugInfo", dmq.b.g, dmq.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (auc $$3 : $$0.ag().t()) {
         $$3.g.b(new adt($$3, $$2));
      }
   }));
   public static final dmq.e<dmq.a> s = a("spectatorsGenerateChunks", dmq.b.a, dmq.a.a(true));
   public static final dmq.e<dmq.d> t = a("spawnRadius", dmq.b.a, dmq.d.a(10));
   public static final dmq.e<dmq.a> u = a("disablePlayerMovementCheck", dmq.b.a, dmq.a.a(false));
   public static final dmq.e<dmq.a> v = a("disableElytraMovementCheck", dmq.b.a, dmq.a.a(false));
   public static final dmq.e<dmq.d> w = a("maxEntityCramming", dmq.b.b, dmq.d.a(24));
   public static final dmq.e<dmq.a> x = a("doWeatherCycle", dmq.b.e, dmq.a.a(true));
   public static final dmq.e<dmq.a> y = a("doLimitedCrafting", dmq.b.a, dmq.a.a(false, ($$0, $$1) -> {
      for (auc $$2 : $$0.ag().t()) {
         $$2.g.b(new adx(adx.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dmq.e<dmq.d> z = a("maxCommandChainLength", dmq.b.g, dmq.d.a(65536));
   public static final dmq.e<dmq.d> A = a("maxCommandForkCount", dmq.b.g, dmq.d.a(65536));
   public static final dmq.e<dmq.d> B = a("commandModificationBlockLimit", dmq.b.g, dmq.d.a(32768));
   public static final dmq.e<dmq.a> C = a("announceAdvancements", dmq.b.f, dmq.a.a(true));
   public static final dmq.e<dmq.a> D = a("disableRaids", dmq.b.b, dmq.a.a(false));
   public static final dmq.e<dmq.a> E = a("doInsomnia", dmq.b.c, dmq.a.a(true));
   public static final dmq.e<dmq.a> F = a("doImmediateRespawn", dmq.b.a, dmq.a.a(false, ($$0, $$1) -> {
      for (auc $$2 : $$0.ag().t()) {
         $$2.g.b(new adx(adx.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dmq.e<dmq.d> G = a("playersNetherPortalDefaultDelay", dmq.b.a, dmq.d.a(80));
   public static final dmq.e<dmq.d> H = a("playersNetherPortalCreativeDelay", dmq.b.a, dmq.d.a(0));
   public static final dmq.e<dmq.a> I = a("drowningDamage", dmq.b.a, dmq.a.a(true));
   public static final dmq.e<dmq.a> J = a("fallDamage", dmq.b.a, dmq.a.a(true));
   public static final dmq.e<dmq.a> K = a("fireDamage", dmq.b.a, dmq.a.a(true));
   public static final dmq.e<dmq.a> L = a("freezeDamage", dmq.b.a, dmq.a.a(true));
   public static final dmq.e<dmq.a> M = a("doPatrolSpawning", dmq.b.c, dmq.a.a(true));
   public static final dmq.e<dmq.a> N = a("doTraderSpawning", dmq.b.c, dmq.a.a(true));
   public static final dmq.e<dmq.a> O = a("doWardenSpawning", dmq.b.c, dmq.a.a(true));
   public static final dmq.e<dmq.a> P = a("forgiveDeadPlayers", dmq.b.b, dmq.a.a(true));
   public static final dmq.e<dmq.a> Q = a("universalAnger", dmq.b.b, dmq.a.a(false));
   public static final dmq.e<dmq.d> R = a("playersSleepingPercentage", dmq.b.a, dmq.d.a(100));
   public static final dmq.e<dmq.a> S = a("blockExplosionDropDecay", dmq.b.d, dmq.a.a(true));
   public static final dmq.e<dmq.a> T = a("mobExplosionDropDecay", dmq.b.d, dmq.a.a(true));
   public static final dmq.e<dmq.a> U = a("tntExplosionDropDecay", dmq.b.d, dmq.a.a(false));
   public static final dmq.e<dmq.d> V = a("snowAccumulationHeight", dmq.b.e, dmq.d.a(1));
   public static final dmq.e<dmq.a> W = a("waterSourceConversion", dmq.b.e, dmq.a.a(true));
   public static final dmq.e<dmq.a> X = a("lavaSourceConversion", dmq.b.e, dmq.a.a(false));
   public static final dmq.e<dmq.a> Y = a("globalSoundEvents", dmq.b.g, dmq.a.a(true));
   public static final dmq.e<dmq.a> Z = a("doVinesSpread", dmq.b.e, dmq.a.a(true));
   public static final dmq.e<dmq.a> aa = a("enderPearlsVanishOnDeath", dmq.b.a, dmq.a.a(true));
   public static final dmq.e<dmq.d> ab = a("minecartMaxSpeed", dmq.b.g, dmq.d.a(8, 1, 1000, cyd.a(cyf.d), ($$0, $$1) -> {}));
   public static final dmq.e<dmq.d> ac = a("spawnChunkRadius", dmq.b.g, dmq.d.a(2, 0, 32, cyd.a(), ($$0, $$1) -> {
      aub $$2 = $$0.J();
      $$2.a($$2.ab(), $$2.ac());
   }));
   public static final dmq.e<dmq.a> ad = a("tntExplodes", dmq.b.g, dmq.a.a(true));
   public static final dmq.e<dmq.a> ae = a("locatorBar", dmq.b.a, dmq.a.a(true, ($$0, $$1) -> $$0.L().forEach($$1x -> {
      ayv $$2 = $$1x.h();
      if ($$1.a()) {
         $$1x.A().forEach($$2::b);
      } else {
         $$2.a();
      }
   })));
   private final Map<dmq.e<?>, dmq.g<?>> ah;
   private final cyd ai;

   public static <T extends dmq.g<T>> dmq.f<T> a(dmq.e<T> $$0) {
      return (dmq.f<T>)ag.get($$0);
   }

   public static <T extends dmq.g<T>> Codec<dmq.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> ag.entrySet()
               .stream()
               .filter($$1x -> ((dmq.f)$$1x.getValue()).e == $$0)
               .map(Entry::getKey)
               .filter($$1x -> $$1x.a().equals($$1))
               .map($$0xx -> $$0xx)
               .findFirst()
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            dmq.e::a
         );
   }

   private static <T extends dmq.g<T>> dmq.e<T> a(String $$0, dmq.b $$1, dmq.f<T> $$2) {
      dmq.e<T> $$3 = new dmq.e<>($$0, $$1);
      dmq.f<?> $$4 = ag.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dmq(cyd $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dmq(cyd $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dmq.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dmq.e<?>, dmq.f<?>>> b(cyd $$0) {
      return ag.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private dmq(Map<dmq.e<?>, dmq.g<?>> $$0, cyd $$1) {
      this.ah = $$0;
      this.ai = $$1;
   }

   public <T extends dmq.g<T>> T b(dmq.e<T> $$0) {
      T $$1 = (T)this.ah.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public ui a() {
      ui $$0 = new ui();
      this.ah.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ah.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dmq a(cyd $$0) {
      return new dmq(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ah.containsKey($$0x.getKey()) ? this.ah.get($$0x.getKey()).f() : ((dmq.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dmq.c $$0) {
      ag.forEach(($$1, $$2) -> this.a($$0, (dmq.e<?>)$$1, (dmq.f<?>)$$2));
   }

   private <T extends dmq.g<T>> void a(dmq.c $$0, dmq.e<?> $$1, dmq.f<?> $$2) {
      if ($$2.f.a(this.ai)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dmq $$0, @Nullable MinecraftServer $$1) {
      $$0.ah.keySet().forEach($$2 -> this.a((dmq.e<?>)$$2, $$0, $$1));
   }

   private <T extends dmq.g<T>> void a(dmq.e<T> $$0, dmq $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(dmq.e<dmq.a> $$0) {
      return this.b($$0).a();
   }

   public int d(dmq.e<dmq.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends dmq.g<dmq.a> {
      private boolean b;

      private static dmq.f<dmq.a> a(boolean $$0, BiConsumer<MinecraftServer, dmq.a> $$1, cyd $$2) {
         return new dmq.f<>(BoolArgumentType::bool, $$1x -> new dmq.a($$1x, $$0), $$1, dmq.c::b, dmq.a.class, $$2);
      }

      static dmq.f<dmq.a> a(boolean $$0, BiConsumer<MinecraftServer, dmq.a> $$1) {
         return new dmq.f<>(BoolArgumentType::bool, $$1x -> new dmq.a($$1x, $$0), $$1, dmq.c::b, dmq.a.class, cyd.a());
      }

      static dmq.f<dmq.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {});
      }

      public a(dmq.f<dmq.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ek> $$0, String $$1) {
         this.b = BoolArgumentType.getBool($$0, $$1);
      }

      public boolean a() {
         return this.b;
      }

      public void a(boolean $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0;
         this.a($$1);
      }

      @Override
      public String b() {
         return Boolean.toString(this.b);
      }

      @Override
      protected void a(String $$0) {
         this.b = Boolean.parseBoolean($$0);
      }

      @Override
      public int c() {
         return this.b ? 1 : 0;
      }

      protected dmq.a d() {
         return this;
      }

      protected dmq.a e() {
         return new dmq.a(this.a, this.b);
      }

      public void a(dmq.a $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static enum b {
      a("gamerule.category.player"),
      b("gamerule.category.mobs"),
      c("gamerule.category.spawning"),
      d("gamerule.category.drops"),
      e("gamerule.category.updates"),
      f("gamerule.category.chat"),
      g("gamerule.category.misc");

      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }
   }

   public interface c {
      default <T extends dmq.g<T>> void a(dmq.e<T> $$0, dmq.f<T> $$1) {
      }

      default void b(dmq.e<dmq.a> $$0, dmq.f<dmq.a> $$1) {
      }

      default void c(dmq.e<dmq.d> $$0, dmq.f<dmq.d> $$1) {
      }
   }

   public static class d extends dmq.g<dmq.d> {
      private int b;

      private static dmq.f<dmq.d> a(int $$0, BiConsumer<MinecraftServer, dmq.d> $$1) {
         return new dmq.f<>(IntegerArgumentType::integer, $$1x -> new dmq.d($$1x, $$0), $$1, dmq.c::c, dmq.d.class, cyd.a());
      }

      static dmq.f<dmq.d> a(int $$0, int $$1, int $$2, cyd $$3, BiConsumer<MinecraftServer, dmq.d> $$4) {
         return new dmq.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dmq.d($$1x, $$0), $$4, dmq.c::c, dmq.d.class, $$3);
      }

      static dmq.f<dmq.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {});
      }

      public d(dmq.f<dmq.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ek> $$0, String $$1) {
         this.b = IntegerArgumentType.getInteger($$0, $$1);
      }

      public int a() {
         return this.b;
      }

      public void a(int $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0;
         this.a($$1);
      }

      @Override
      public String b() {
         return Integer.toString(this.b);
      }

      @Override
      protected void a(String $$0) {
         this.b = c($$0);
      }

      public boolean b(String $$0) {
         try {
            StringReader $$1 = new StringReader($$0);
            this.b = (Integer)this.a.a.get().parse($$1);
            return !$$1.canRead();
         } catch (CommandSyntaxException var3) {
            return false;
         }
      }

      private static int c(String $$0) {
         if (!$$0.isEmpty()) {
            try {
               return Integer.parseInt($$0);
            } catch (NumberFormatException var2) {
               dmq.af.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dmq.d d() {
         return this;
      }

      protected dmq.d e() {
         return new dmq.d(this.a, this.b);
      }

      public void a(dmq.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dmq.g<T>> {
      final String a;
      private final dmq.b b;

      public e(String $$0, dmq.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dmq.e && ((dmq.e)$$0).a.equals(this.a);
      }

      @Override
      public int hashCode() {
         return this.a.hashCode();
      }

      public String a() {
         return this.a;
      }

      public String b() {
         return "gamerule." + this.a;
      }

      public dmq.b c() {
         return this.b;
      }
   }

   public static class f<T extends dmq.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dmq.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dmq.h<T> d;
      final Class<T> e;
      final cyd f;

      f(Supplier<ArgumentType<?>> $$0, Function<dmq.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dmq.h<T> $$3, Class<T> $$4, cyd $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      public RequiredArgumentBuilder<ek, ?> a(String $$0) {
         return el.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dmq.c $$0, dmq.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cyd b() {
         return this.f;
      }
   }

   public abstract static class g<T extends dmq.g<T>> {
      protected final dmq.f<T> a;

      public g(dmq.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ek> var1, String var2);

      public void b(CommandContext<ek> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ek)$$0.getSource()).l());
      }

      protected void a(@Nullable MinecraftServer $$0) {
         if ($$0 != null) {
            this.a.c.accept($$0, this.g());
         }
      }

      protected abstract void a(String var1);

      public abstract String b();

      @Override
      public String toString() {
         return this.b();
      }

      public abstract int c();

      protected abstract T g();

      protected abstract T f();

      public abstract void a(T var1, @Nullable MinecraftServer var2);
   }

   interface h<T extends dmq.g<T>> {
      void call(dmq.c var1, dmq.e<T> var2, dmq.f<T> var3);
   }
}
