import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ha extends btb<ha.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xo.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final ame h = ame.b("count");
   static final Map<ame, ha.a> i = Stream.of(new ha.a(h, $$0 -> true, cx.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(ha.a::a, $$0 -> (ha.a)$$0));
   static final Map<ame, ha.c> j = Stream.of(new ha.c(h, cx.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(ha.c::a, $$0 -> (ha.c)$$0));

   public ha(eg $$0) {
      super(gv.a(new ha.b($$0)).a($$0x -> ag.a($$0x)::test));
   }

   public static ha a(eg $$0) {
      return new ha($$0);
   }

   public static ha.d a(CommandContext<ek> $$0, String $$1) {
      return (ha.d)$$0.getArgument($$1, ha.d.class);
   }

   public Collection<String> getExamples() {
      return a;
   }

   record a(ame a, Predicate<dcv> b, Decoder<? extends Predicate<dcv>> c) {

      public static <T> ha.a a(ImmutableStringReader $$0, ame $$1, kp<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw ha.d.createWithContext($$0, $$1);
         } else {
            return new ha.a($$1, $$1x -> $$1x.c($$2), $$3.map($$1x -> $$2x -> {
               T $$3x = $$2x.a($$2);
               return Objects.equals($$1x, $$3x);
            }));
         }
      }

      public Predicate<dcv> a(ImmutableStringReader $$0, Dynamic<?> $$1) throws CommandSyntaxException {
         DataResult<? extends Predicate<dcv>> $$2 = this.c.parse($$1);
         return (Predicate<dcv>)$$2.getOrThrow($$1x -> ha.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements gv.b<Predicate<dcv>, ha.a, ha.c> {
      private final jn.a a;
      private final jn.b<dcr> b;
      private final jn.b<kp<?>> c;
      private final jn.b<kz.b<?>> d;

      b(jn.a $$0) {
         this.a = $$0;
         this.b = $$0.e(mn.N);
         this.c = $$0.e(mn.r);
         this.d = $$0.e(mn.q);
      }

      public Predicate<dcv> e(ImmutableStringReader $$0, ame $$1) throws CommandSyntaxException {
         jl.c<dcr> $$2 = this.b.a(amd.a(mn.N, $$1)).orElseThrow(() -> ha.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<dcv> f(ImmutableStringReader $$0, ame $$1) throws CommandSyntaxException {
         jp<dcr> $$2 = this.b.a(bae.a(mn.N, $$1)).orElseThrow(() -> ha.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public ha.a g(ImmutableStringReader $$0, ame $$1) throws CommandSyntaxException {
         ha.a $$2 = ha.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kp<?> $$3 = this.c.a(amd.a(mn.r, $$1)).map(jl::a).orElseThrow(() -> ha.d.createWithContext($$0, $$1));
            return ha.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<dcv> a(ImmutableStringReader $$0, ha.a $$1, Dynamic<?> $$2) throws CommandSyntaxException {
         return $$1.a($$0, amc.a($$2, this.a));
      }

      public Predicate<dcv> a(ImmutableStringReader $$0, ha.a $$1) {
         return $$1.b;
      }

      public ha.c h(ImmutableStringReader $$0, ame $$1) throws CommandSyntaxException {
         ha.c $$2 = ha.j.get($$1);
         return $$2 != null ? $$2 : this.d.a(amd.a(mn.q, $$1)).map(ha.c::new).orElseThrow(() -> ha.f.createWithContext($$0, $$1));
      }

      public Predicate<dcv> a(ImmutableStringReader $$0, ha.c $$1, Dynamic<?> $$2) throws CommandSyntaxException {
         return $$1.a($$0, amc.a($$2, this.a));
      }

      @Override
      public Stream<ame> a() {
         return this.b.d_().map(amd::a);
      }

      @Override
      public Stream<ame> b() {
         return this.b.f().map(bae::b);
      }

      @Override
      public Stream<ame> c() {
         return Stream.concat(ha.i.keySet().stream(), this.c.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<ame> d() {
         return Stream.concat(ha.j.keySet().stream(), this.d.d_().map(amd::a));
      }

      public Predicate<dcv> a(Predicate<dcv> $$0) {
         return $$0.negate();
      }

      public Predicate<dcv> b(List<Predicate<dcv>> $$0) {
         return ag.b($$0);
      }
   }

   record c(ame a, Decoder<? extends Predicate<dcv>> b) {
      public c(jl.c<kz.b<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<dcv> a(ImmutableStringReader $$0, Dynamic<?> $$1) throws CommandSyntaxException {
         DataResult<? extends Predicate<dcv>> $$2 = this.b.parse($$1);
         return (Predicate<dcv>)$$2.getOrThrow($$1x -> ha.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<dcv> {
   }
}
