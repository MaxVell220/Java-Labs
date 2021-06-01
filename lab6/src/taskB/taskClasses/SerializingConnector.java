package taskB.taskClasses;

import exceptions.ClassDoesNotExistException;
import exceptions.SerializeException;

import java.io.*;
import java.util.ArrayList;

public class SerializingConnector {
    public static void serializeCoffee(Coffee obj, FileOutputStream file) throws SerializeException {
        try (ObjectOutputStream oos = new ObjectOutputStream(file)) {
            oos.writeObject(obj);
        } catch (IOException e) {
            throw new SerializeException("Problem with serialization of coffee object");
        }
    }

    public static void serializeVan(Van obj, FileOutputStream file) throws SerializeException {
        try (ObjectOutputStream oos = new ObjectOutputStream(file)) {
            oos.writeObject(obj);
        } catch (IOException e) {
            throw new SerializeException("Problem with serialization of van object");
        }
    }

    public static void serializeArrayListOfCoffee(ArrayList<Coffee> obj, FileOutputStream file) throws SerializeException {
        try (ObjectOutputStream oos = new ObjectOutputStream(file)) {
            oos.writeObject(obj);
        } catch (IOException e) {
            throw new SerializeException("Problem with serialization of van object");
        }
    }

    public static Coffee deserializeCoffee(Coffee obj, FileInputStream file) throws SerializeException, ClassDoesNotExistException {
        try (ObjectInputStream ois = new ObjectInputStream(file)) {
            return (Coffee) ois.readObject();
        } catch (IOException e) {
            throw new SerializeException("Problem with deserialization of coffee object");
        } catch (ClassNotFoundException e) {
            throw new ClassDoesNotExistException("Class coffee not found");
        }
    }

    public static Van deserializeVan(Van obj, FileInputStream file) throws SerializeException, ClassDoesNotExistException {
        try (ObjectInputStream ois = new ObjectInputStream(file)) {
            return (Van) ois.readObject();
        } catch (IOException e) {
            throw new SerializeException("Problem with deserialization of van object");
        } catch (ClassNotFoundException e) {
            throw new ClassDoesNotExistException("Class van not found");
        }
    }

    public static ArrayList<Coffee> deserializeArrayListOfCoffee(ArrayList<Coffee> obj, FileInputStream file) throws SerializeException, ClassDoesNotExistException {
        try (ObjectInputStream ois = new ObjectInputStream(file)) {
            return (ArrayList<Coffee>) ois.readObject();
        } catch (IOException e) {
            throw new SerializeException("Problem with serialization of arrayList of coffee object");
        } catch (ClassNotFoundException e) {
            throw new ClassDoesNotExistException("Class coffee not found");
        }
    }

}
