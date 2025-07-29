import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.Error;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class anw {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.create.invalid_name", $$0));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.create.invalid_full_name", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.create.already_exists", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.datapack.create.metadata_encode_failure", $$0, $$1)
   );
   private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.create.io_failure", $$0));
   private static final SuggestionProvider<ek> l = ($$0, $$1) -> eq.b(
      ((ek)$$0.getSource()).l().aF().e().stream().map(StringArgumentType::escapeIfRequired), $$1
   );
   private static final SuggestionProvider<ek> m = ($$0, $$1) -> {
      awz $$2 = ((ek)$$0.getSource()).l().aF();
      Collection<String> $$3 = $$2.e();
      cyd $$4 = ((ek)$$0.getSource()).v();
      return eq.b(
         $$2.d().stream().filter($$1x -> $$1x.e().a($$4)).map(aww::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("datapack")
                        .requires(el.a(2)))
                     .then(
                        el.b("enable")
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                                "name", StringArgumentType.string()
                                             )
                                             .suggests(m)
                                             .executes(
                                                $$0x -> a((ek)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1x) -> $$1x.k().a($$0xx, $$1x, aww::h, false))
                                             ))
                                          .then(
                                             el.b("after")
                                                .then(
                                                   el.a("existing", StringArgumentType.string())
                                                      .suggests(l)
                                                      .executes(
                                                         $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1x, $$2) -> $$1x.add($$1x.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          el.b("before")
                                             .then(
                                                el.a("existing", StringArgumentType.string())
                                                   .suggests(l)
                                                   .executes(
                                                      $$0x -> a(
                                                         (ek)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1x, $$2) -> $$1x.add($$1x.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(el.b("last").executes($$0x -> a((ek)$$0x.getSource(), a($$0x, "name", true), List::add))))
                                 .then(el.b("first").executes($$0x -> a((ek)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1x) -> $$0xx.add(0, $$1x))))
                           )
                     ))
                  .then(
                     el.b("disable")
                        .then(el.a("name", StringArgumentType.string()).suggests(l).executes($$0x -> a((ek)$$0x.getSource(), a($$0x, "name", false))))
                  ))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("list").executes($$0x -> a((ek)$$0x.getSource())))
                        .then(el.b("available").executes($$0x -> b((ek)$$0x.getSource()))))
                     .then(el.b("enabled").executes($$0x -> c((ek)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)el.b("create").requires(el.a(4)))
                  .then(
                     el.a("id", StringArgumentType.string())
                        .then(
                           el.a("description", eu.a($$1))
                              .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "id"), eu.b($$0x, "description")))
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, String $$1, xo $$2) throws CommandSyntaxException {
      Path $$3 = $$0.l().a(fcq.j);
      if (!w.f($$1)) {
         throw g.create($$1);
      } else if (!w.b($$1)) {
         throw h.create($$1);
      } else {
         Path $$4 = $$3.resolve($$1);
         if (Files.exists($$4)) {
            throw i.create($$1);
         } else {
            awp $$5 = new awp($$2, ac.b().a(awd.b), Optional.empty());
            DataResult<JsonElement> $$6 = awp.a.encodeStart(JsonOps.INSTANCE, $$5);
            Optional<Error<JsonElement>> $$7 = $$6.error();
            if ($$7.isPresent()) {
               throw j.create($$1, $$7.get().message());
            } else {
               JsonObject $$8 = new JsonObject();
               $$8.add(awp.b.a(), (JsonElement)$$6.getOrThrow());

               try {
                  Files.createDirectory($$4);
                  Files.createDirectory($$4.resolve(awd.b.a()));

                  try (BufferedWriter $$9 = Files.newBufferedWriter($$4.resolve("pack.mcmeta"), StandardCharsets.UTF_8)) {
                     JsonWriter $$10 = new JsonWriter($$9);

                     try {
                        $$10.setSerializeNulls(false);
                        $$10.setIndent("  ");
                        bbq.a($$10, $$8, null);
                     } catch (Throwable var15) {
                        try {
                           $$10.close();
                        } catch (Throwable var14) {
                           var15.addSuppressed(var14);
                        }

                        throw var15;
                     }

                     $$10.close();
                  }
               } catch (IOException var17) {
                  a.warn("Failed to create pack at {}", $$3.toAbsolutePath(), var17);
                  throw k.create($$1);
               }

               $$0.a(() -> xo.a("commands.datapack.create.success", $$1), true);
               return 1;
            }
         }
      }
   }

   private static int a(ek $$0, aww $$1, anw.a $$2) throws CommandSyntaxException {
      awz $$3 = $$0.l().aF();
      List<aww> $$4 = Lists.newArrayList($$3.g());
      $$2.apply($$4, $$1);
      $$0.a(() -> xo.a("commands.datapack.modify.enable", $$1.a(true)), true);
      apo.a($$4.stream().map(aww::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(ek $$0, aww $$1) {
      awz $$2 = $$0.l().aF();
      List<aww> $$3 = Lists.newArrayList($$2.g());
      $$3.remove($$1);
      $$0.a(() -> xo.a("commands.datapack.modify.disable", $$1.a(true)), true);
      apo.a($$3.stream().map(aww::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(ek $$0) {
      return c($$0) + b($$0);
   }

   private static int b(ek $$0) {
      awz $$1 = $$0.l().aF();
      $$1.a();
      Collection<aww> $$2 = $$1.g();
      Collection<aww> $$3 = $$1.d();
      cyd $$4 = $$0.v();
      List<aww> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> xo.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> xo.a("commands.datapack.list.available.success", $$5.size(), xr.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(ek $$0) {
      awz $$1 = $$0.l().aF();
      $$1.a();
      Collection<? extends aww> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> xo.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> xo.a("commands.datapack.list.enabled.success", $$2.size(), xr.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static aww a(CommandContext<ek> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      awz $$4 = ((ek)$$0.getSource()).l().aF();
      aww $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw b.create($$3);
      } else {
         boolean $$6 = $$4.g().contains($$5);
         if ($$2 && $$6) {
            throw c.create($$3);
         } else if (!$$2 && !$$6) {
            throw d.create($$3);
         } else {
            cyd $$7 = ((ek)$$0.getSource()).v();
            cyd $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == axa.d) {
               throw e.create($$3);
            } else if (!$$8.a($$7)) {
               throw f.create($$3, cyf.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<aww> var1, aww var2) throws CommandSyntaxException;
   }
}
