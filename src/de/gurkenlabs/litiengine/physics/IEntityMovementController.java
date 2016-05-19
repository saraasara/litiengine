package de.gurkenlabs.litiengine.physics;

import java.util.List;
import java.util.function.Predicate;

import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.entities.IMovableEntity;

public interface IEntityMovementController extends IUpdateable{
  public IMovableEntity getControlledEntity();

  public void apply(Force force);

  public List<Force> getActiceForces();

  public void onMovementCheck(Predicate<IEntityMovementController> predicate);
}
