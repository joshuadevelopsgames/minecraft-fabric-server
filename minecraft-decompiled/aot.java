import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class aot {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xo.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("item").requires(el.a(2)))
               .then(
                  ((LiteralArgumentBuilder)el.b("replace")
                        .then(
                           el.b("block")
                              .then(
                                 el.a("pos", gk.a())
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("slot", fv.a())
                                             .then(
                                                el.b("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)el.a("item", gx.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                  (ek)$$0x.getSource(), gk.a($$0x, "pos"), fv.a($$0x, "slot"), gx.a($$0x, "item").a(1, false)
                                                               )
                                                            ))
                                                         .then(
                                                            el.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                     (ek)$$0x.getSource(),
                                                                     gk.a($$0x, "pos"),
                                                                     fv.a($$0x, "slot"),
                                                                     gx.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)el.b("from")
                                                   .then(
                                                      el.b("block")
                                                         .then(
                                                            el.a("source", gk.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)el.a("sourceSlot", fv.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                              (ek)$$0x.getSource(),
                                                                              gk.a($$0x, "source"),
                                                                              fv.a($$0x, "sourceSlot"),
                                                                              gk.a($$0x, "pos"),
                                                                              fv.a($$0x, "slot")
                                                                           )
                                                                        ))
                                                                     .then(
                                                                        el.a("modifier", fo.b($$1))
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                 (ek)$$0x.getSource(),
                                                                                 gk.a($$0x, "source"),
                                                                                 fv.a($$0x, "sourceSlot"),
                                                                                 gk.a($$0x, "pos"),
                                                                                 fv.a($$0x, "slot"),
                                                                                 fo.b($$0x, "modifier")
                                                                              )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   el.b("entity")
                                                      .then(
                                                         el.a("source", ey.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)el.a("sourceSlot", fv.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                           (ek)$$0x.getSource(),
                                                                           ey.a($$0x, "source"),
                                                                           fv.a($$0x, "sourceSlot"),
                                                                           gk.a($$0x, "pos"),
                                                                           fv.a($$0x, "slot")
                                                                        )
                                                                     ))
                                                                  .then(
                                                                     el.a("modifier", fo.b($$1))
                                                                        .executes(
                                                                           $$0x -> a(
                                                                              (ek)$$0x.getSource(),
                                                                              ey.a($$0x, "source"),
                                                                              fv.a($$0x, "sourceSlot"),
                                                                              gk.a($$0x, "pos"),
                                                                              fv.a($$0x, "slot"),
                                                                              fo.b($$0x, "modifier")
                                                                           )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        el.b("entity")
                           .then(
                              el.a("targets", ey.b())
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("slot", fv.a())
                                          .then(
                                             el.b("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)el.a("item", gx.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                               (ek)$$0x.getSource(), ey.b($$0x, "targets"), fv.a($$0x, "slot"), gx.a($$0x, "item").a(1, false)
                                                            )
                                                         ))
                                                      .then(
                                                         el.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                  (ek)$$0x.getSource(),
                                                                  ey.b($$0x, "targets"),
                                                                  fv.a($$0x, "slot"),
                                                                  gx.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                               )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)el.b("from")
                                                .then(
                                                   el.b("block")
                                                      .then(
                                                         el.a("source", gk.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)el.a("sourceSlot", fv.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                           (ek)$$0x.getSource(),
                                                                           gk.a($$0x, "source"),
                                                                           fv.a($$0x, "sourceSlot"),
                                                                           ey.b($$0x, "targets"),
                                                                           fv.a($$0x, "slot")
                                                                        )
                                                                     ))
                                                                  .then(
                                                                     el.a("modifier", fo.b($$1))
                                                                        .executes(
                                                                           $$0x -> a(
                                                                              (ek)$$0x.getSource(),
                                                                              gk.a($$0x, "source"),
                                                                              fv.a($$0x, "sourceSlot"),
                                                                              ey.b($$0x, "targets"),
                                                                              fv.a($$0x, "slot"),
                                                                              fo.b($$0x, "modifier")
                                                                           )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                el.b("entity")
                                                   .then(
                                                      el.a("source", ey.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)el.a("sourceSlot", fv.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                        (ek)$$0x.getSource(),
                                                                        ey.a($$0x, "source"),
                                                                        fv.a($$0x, "sourceSlot"),
                                                                        ey.b($$0x, "targets"),
                                                                        fv.a($$0x, "slot")
                                                                     )
                                                                  ))
                                                               .then(
                                                                  el.a("modifier", fo.b($$1))
                                                                     .executes(
                                                                        $$0x -> a(
                                                                           (ek)$$0x.getSource(),
                                                                           ey.a($$0x, "source"),
                                                                           fv.a($$0x, "sourceSlot"),
                                                                           ey.b($$0x, "targets"),
                                                                           fv.a($$0x, "slot"),
                                                                           fo.b($$0x, "modifier")
                                                                        )
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)el.b("modify")
                     .then(
                        el.b("block")
                           .then(
                              el.a("pos", gk.a())
                                 .then(
                                    el.a("slot", fv.a())
                                       .then(
                                          el.a("modifier", fo.b($$1))
                                             .executes($$0x -> a((ek)$$0x.getSource(), gk.a($$0x, "pos"), fv.a($$0x, "slot"), fo.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     el.b("entity")
                        .then(
                           el.a("targets", ey.b())
                              .then(
                                 el.a("slot", fv.a())
                                    .then(
                                       el.a("modifier", fo.b($$1))
                                          .executes($$0x -> a((ek)$$0x.getSource(), ey.b($$0x, "targets"), fv.a($$0x, "slot"), fo.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, jb $$1, int $$2, jl<fex> $$3) throws CommandSyntaxException {
      bxc $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         dcv $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xo.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ek $$0, Collection<? extends bzm> $$1, int $$2, jl<fex> $$3) throws CommandSyntaxException {
      Map<bzm, dcv> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bzm $$5 : $$1) {
         cbd $$6 = $$5.a_($$2);
         if ($$6 != cbd.a) {
            dcv $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof auc) {
                  ((auc)$$5).cn.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bzm, dcv> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xo.a("commands.item.entity.set.success.single", $$8.getKey().Q_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> xo.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ek $$0, jb $$1, int $$2, dcv $$3) throws CommandSyntaxException {
      bxc $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xo.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bxc a(ek $$0, jb $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      eaz $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bxc)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bxc)$$3;
      }
   }

   private static int a(ek $$0, Collection<? extends bzm> $$1, int $$2, dcv $$3) throws CommandSyntaxException {
      List<bzm> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bzm $$5 : $$1) {
         cbd $$6 = $$5.a_($$2);
         if ($$6 != cbd.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof auc) {
               ((auc)$$5).cn.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xo.a("commands.item.entity.set.success.single", $$4.iterator().next().Q_(), $$3.K()), true);
         } else {
            $$0.a(() -> xo.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ek $$0, jb $$1, int $$2, Collection<? extends bzm> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ek $$0, jb $$1, int $$2, Collection<? extends bzm> $$3, int $$4, jl<fex> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ek $$0, jb $$1, int $$2, jb $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ek $$0, jb $$1, int $$2, jb $$3, int $$4, jl<fex> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ek $$0, bzm $$1, int $$2, jb $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ek $$0, bzm $$1, int $$2, jb $$3, int $$4, jl<fex> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ek $$0, bzm $$1, int $$2, Collection<? extends bzm> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ek $$0, bzm $$1, int $$2, Collection<? extends bzm> $$3, int $$4, jl<fex> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static dcv a(ek $$0, jl<fex> $$1, dcv $$2) {
      aub $$3 = $$0.e();
      fdm $$4 = new fdm.a($$3).a(fgd.f, $$0.d()).b(fgd.a, $$0.f()).a(fgc.d);
      fdj $$5 = new fdj.a($$4).a(Optional.empty());
      $$5.b(fdj.a($$1.a()));
      dcv $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static dcv a(bzm $$0, int $$1) throws CommandSyntaxException {
      cbd $$2 = $$0.a_($$1);
      if ($$2 == cbd.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static dcv a(ek $$0, jb $$1, int $$2) throws CommandSyntaxException {
      bxc $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
