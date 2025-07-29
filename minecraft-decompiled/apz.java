import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class apz {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("serverpack").requires(el.a(2)))
               .then(
                  el.b("push")
                     .then(
                        ((RequiredArgumentBuilder)el.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)el.a("uuid", gd.a())
                                       .then(
                                          el.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   StringArgumentType.getString($$0x, "url"),
                                                   Optional.of(gd.a($$0x, "uuid")),
                                                   Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                          (ek)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(gd.a($$0x, "uuid")), Optional.empty()
                                       )
                                    )
                              ))
                           .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(el.b("pop").then(el.a("uuid", gd.a()).executes($$0x -> a((ek)$$0x.getSource(), gd.a($$0x, "uuid")))))
      );
   }

   private static void a(ek $$0, zw<?> $$1) {
      $$0.l().ah().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ek $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      aam $$6 = new aam($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ek $$0, UUID $$1) {
      aal $$2 = new aal(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
