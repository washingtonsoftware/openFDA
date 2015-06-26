package com.wasoftware.openfda.Service;

/**
 * Created by yipty on 6/25/2015.
 */
import java.util.List;

import com.wasoftware.openfda.model.DataSetsEntity;
public interface DataSetsService {
    public void addDataSetsEntity(DataSetsEntity dataSet);
    public void updateDataSetsEntity( DataSetsEntity dataSet);
    public List<DataSetsEntity> listDataSetsEntity();
    public DataSetsEntity getDataSetsEntityById(int id);
    public void removeDataSetsEntity(int id);
}