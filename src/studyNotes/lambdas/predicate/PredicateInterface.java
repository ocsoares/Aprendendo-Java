package studyNotes.lambdas.predicate;

import studyNotes.collections.list.withObjects.Fruit;

// Só é Permitido APENAS UM Método em uma Interface FUNCIONAL (com Lambda) !!!
@FunctionalInterface
public interface PredicateInterface {
    boolean isExpired(Fruit fruit);
}
