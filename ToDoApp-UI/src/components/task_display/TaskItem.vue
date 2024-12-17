<template>
<v-list-item> 
    <v-checkbox>


    </v-checkbox>
<v-list-item-content>

    <v-list-item-title>
        {{props.task.name}}
    </v-list-item-title>
</v-list-item-content>


</v-list-item>


</template>

<script setup lang="ts">
import Task from '@/models/taskModel';

const props = defineProps<{ task: Task }>();

</script>