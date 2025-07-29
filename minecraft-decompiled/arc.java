import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class arc {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xo.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xo.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xo.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> xo.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xo.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, arc.c>> a = ImmutableList.of(ard.a, ara.a, are.a);
   public static final List<arc.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<arc.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralArgumentBuilder<ek> $$1 = (LiteralArgumentBuilder<ek>)el.b("data").requires(el.a(2));

      for (arc.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(el.b("merge"), $$1x -> $$1x.then(el.a("nbt", ev.a()).executes($$1xx -> a((ek)$$1xx.getSource(), $$2.a($$1xx), ev.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        el.b("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ek)$$1xx.getSource(), $$2.a($$1xx)))
                           .then(
                              ((RequiredArgumentBuilder)el.a("path", fe.a()).executes($$1xx -> b((ek)$$1xx.getSource(), $$2.a($$1xx), fe.a($$1xx, "path"))))
                                 .then(
                                    el.a("scale", DoubleArgumentType.doubleArg())
                                       .executes(
                                          $$1xx -> a((ek)$$1xx.getSource(), $$2.a($$1xx), fe.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                       )
                                 )
                           )
                     )
                  ))
               .then(
                  $$2.a(el.b("remove"), $$1x -> $$1x.then(el.a("path", fe.a()).executes($$1xx -> a((ek)$$1xx.getSource(), $$2.a($$1xx), fe.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ek, ?>, arc.b>)(($$0x, $$1x) -> $$0x.then(
                        el.b("insert")
                           .then(
                              el.a("index", IntegerArgumentType.integer())
                                 .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                           )
                     )
                     .then(el.b("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                     .then(el.b("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                     .then(el.b("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (vi)Iterables.getLast($$3)))))
                     .then(el.b("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                        ui $$4 = new ui();

                        for (vi $$5 : $$3) {
                           if (fe.g.a($$5, 0)) {
                              throw fe.b.create();
                           }

                           if (!($$5 instanceof ui $$6)) {
                              throw h.create($$5);
                           }

                           $$4.a($$6);
                        }

                        Collection<vi> $$7 = $$2x.a($$1xx, ui::new);
                        int $$8 = 0;

                        for (vi $$9 : $$7) {
                           if (!($$9 instanceof ui $$10)) {
                              throw h.create($$9);
                           }

                           ui $$12 = $$10.l();
                           $$10.a($$4);
                           $$8 += $$12.equals($$10) ? 0 : 1;
                        }

                        return $$8;
                     }))))
               )
            );
      }

      $$0.register($$1);
   }

   private static String a(vi $$0) throws CommandSyntaxException {
      return switch ($$0) {
         case vg var3 -> {
            vg var8 = var3;

            try {
               var9 = var8.k();
            } catch (Throwable var6) {
               throw new MatchException(var6.toString(), var6);
            }

            String var7 = var9;
            yield var7;
         }
         case uz $$2 -> $$2.toString();
         default -> throw i.create($$0);
      };
   }

   private static List<vi> a(List<vi> $$0, arc.d $$1) throws CommandSyntaxException {
      List<vi> $$2 = new ArrayList<>($$0.size());

      for (vi $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(vg.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ek, ?> a(BiConsumer<ArgumentBuilder<ek, ?>, arc.b> $$0) {
      LiteralArgumentBuilder<ek> $$1 = el.b("modify");

      for (arc.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ek, ?> $$3 = el.a("targetPath", fe.a());

               for (arc.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                        el.b("from"),
                        $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                           .then(el.a("sourcePath", fe.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                     )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                        el.b("string"),
                        $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                           .then(
                              ((RequiredArgumentBuilder)el.a("sourcePath", fe.a())
                                    .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("start", IntegerArgumentType.integer())
                                          .executes(
                                             $$3xx -> a(
                                                $$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                             )
                                          ))
                                       .then(
                                          el.a("end", IntegerArgumentType.integer())
                                             .executes(
                                                $$3xx -> a(
                                                   $$3xx,
                                                   $$2,
                                                   $$2xx,
                                                   a(
                                                      b($$3xx, $$4),
                                                      $$1xxxxx -> b(
                                                         $$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start"), IntegerArgumentType.getInteger($$3xx, "end")
                                                      )
                                                   )
                                                )
                                             )
                                       )
                                 )
                           )
                     )
                  );
               }

               $$0.accept($$3, $$1xx -> el.b("value").then(el.a("value", ff.a()).executes($$2xx -> {
                  List<vi> $$3x = Collections.singletonList(ff.a($$2xx, "value"));
                  return a($$2xx, $$2, $$1xx, $$3x);
               })));
               return $$2x.then($$3);
            }
         );
      }

      return $$1;
   }

   private static String a(String $$0, int $$1, int $$2) throws CommandSyntaxException {
      if ($$1 >= 0 && $$2 <= $$0.length() && $$1 <= $$2) {
         return $$0.substring($$1, $$2);
      } else {
         throw j.create($$1, $$2);
      }
   }

   private static String b(String $$0, int $$1, int $$2) throws CommandSyntaxException {
      int $$3 = $$0.length();
      int $$4 = a($$1, $$3);
      int $$5 = a($$2, $$3);
      return a($$0, $$4, $$5);
   }

   private static String a(String $$0, int $$1) throws CommandSyntaxException {
      int $$2 = $$0.length();
      return a($$0, a($$1, $$2), $$2);
   }

   private static int a(int $$0, int $$1) {
      return $$0 >= 0 ? $$0 : $$1 + $$0;
   }

   private static List<vi> a(CommandContext<ek> $$0, arc.c $$1) throws CommandSyntaxException {
      arb $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<vi> b(CommandContext<ek> $$0, arc.c $$1) throws CommandSyntaxException {
      arb $$2 = $$1.a($$0);
      fe.g $$3 = fe.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ek> $$0, arc.c $$1, arc.a $$2, List<vi> $$3) throws CommandSyntaxException {
      arb $$4 = $$1.a($$0);
      fe.g $$5 = fe.a($$0, "targetPath");
      ui $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ek)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ek $$0, arb $$1, fe.g $$2) throws CommandSyntaxException {
      ui $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static vi a(fe.g $$0, arb $$1) throws CommandSyntaxException {
      Collection<vi> $$2 = $$0.a($$1.a());
      Iterator<vi> $$3 = $$2.iterator();
      vi $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ek $$0, arb $$1, fe.g $$2) throws CommandSyntaxException {
      vi $$3 = a($$2, $$1);

      int $$9 = switch ($$3) {
         case uy $$4 -> bcb.a($$4.k());
         case uh $$5 -> $$5.size();
         case ui $$6 -> $$6.i();
         case vg var10 -> {
            vg var10000 = var10;

            try {
               var15 = var10000.k();
            } catch (Throwable var13) {
               throw new MatchException(var13.toString(), var13);
            }

            String var14 = var15;
            yield var14.length();
         }
         case uk $$8 -> throw f.create($$2.toString());
         default -> throw new MatchException(null, null);
      };
      $$0.a(() -> $$1.a($$3), false);
      return $$9;
   }

   private static int a(ek $$0, arb $$1, fe.g $$2, double $$3) throws CommandSyntaxException {
      vi $$4 = a($$2, $$1);
      if (!($$4 instanceof uy)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = bcb.a(((uy)$$4).k() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ek $$0, arb $$1) throws CommandSyntaxException {
      ui $$2 = $$1.a();
      $$0.a(() -> $$1.a((vi)$$2), false);
      return 1;
   }

   private static int a(ek $$0, arb $$1, ui $$2) throws CommandSyntaxException {
      ui $$3 = $$1.a();
      if (fe.g.a($$2, 0)) {
         throw fe.b.create();
      } else {
         ui $$4 = $$3.l().a($$2);
         if ($$3.equals($$4)) {
            throw d.create();
         } else {
            $$1.a($$4);
            $$0.a(() -> $$1.b(), true);
            return 1;
         }
      }
   }

   @FunctionalInterface
   interface a {
      int modify(CommandContext<ek> var1, ui var2, fe.g var3, List<vi> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ek, ?> create(arc.a var1);
   }

   public interface c {
      arb a(CommandContext<ek> var1) throws CommandSyntaxException;

      ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> var1, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
