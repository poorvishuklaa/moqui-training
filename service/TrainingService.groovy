def training = ec.entity.makeValue("MoquiTraining")
training.setFields(context, true, null, null) //  entity object with values from the context.
training.setSequencedIdPrimary() //Sets a unique primary key
training.create() //inserts new record into database

// Groovy code snippet is used in the Moqui framework to
// create a new record in the MoquiTraining entity
 def training = ec.entity.makeValue("MoquiTraining")
//Purpose: Creates a new entity value object for the MoquiTraining entity.
//Explanation:
//ec.entity: This is the EntityFacade object from the Moqui framework,
// which provides methods for interacting with entities.
//makeValue("MoquiTraining"): Initializes a new instance of the MoquiTraining entity with no values set yet.